package com.example.manualaplicacion;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreferenceCompat;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }

    public static class SettingsFragment extends PreferenceFragmentCompat
            implements SharedPreferences.OnSharedPreferenceChangeListener {

        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.preferences, rootKey);

            // Configuración del modo oscuro
            SwitchPreferenceCompat darkModePreference = findPreference("dark_mode");
            darkModePreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
                @Override
                public boolean onPreferenceChange(Preference preference, Object newValue) {
                    boolean isDarkModeEnabled = (boolean) newValue;
                    int mode = isDarkModeEnabled
                            ? AppCompatDelegate.MODE_NIGHT_YES
                            : AppCompatDelegate.MODE_NIGHT_NO;
                    AppCompatDelegate.setDefaultNightMode(mode);
                    getActivity().recreate();
                    return true;
                }
            });

            // Configuración para borrar caché y reiniciar la aplicación
            Preference clearCachePreference = findPreference("clear_cache");
            clearCachePreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                @Override
                public boolean onPreferenceClick(Preference preference) {
                    showConfirmationDialog();
                    return true;
                }
            });

            // Configuración para conceder permisos
            Preference permissionSettingPreference = findPreference("permission_setting");
            permissionSettingPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                @Override
                public boolean onPreferenceClick(Preference preference) {
                    openAppSettings();
                    return true;
                }
            });
        }

        private void restartApp() {
            Intent intent = getActivity().getPackageManager().getLaunchIntentForPackage(getActivity().getPackageName());
            if (intent != null) {
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        }

        private void showConfirmationDialog() {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setTitle("Confirmación")
                    .setMessage("¿Estás seguro de que deseas borrar el caché y reiniciar la aplicación?");

            String textoAceptar = "Aceptar";
            SpannableString spannableAceptar = new SpannableString(textoAceptar);
            spannableAceptar.setSpan(new ForegroundColorSpan(Color.CYAN), 0, textoAceptar.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

            String textoCancelar = "Cancelar";
            SpannableString spannableCancelar = new SpannableString(textoCancelar);
            spannableCancelar.setSpan(new ForegroundColorSpan(Color.RED), 0, textoCancelar.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

            builder.setPositiveButton(spannableAceptar, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            clearCache(requireContext());
                            restartApp();
                        }


                    })
                    .setNegativeButton(spannableCancelar, null)
                    .show();
        }



        private void clearCache(Context context) {
            try {
                // Borrar el caché de la aplicación
                context.getCacheDir().deleteOnExit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void openAppSettings() {
            Intent intent = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
            intent.setData(Uri.parse("package:" + requireContext().getPackageName()));
            startActivity(intent);
        }

        @Override
        public void onResume() {
            super.onResume();
            getPreferenceManager().getSharedPreferences()
                    .registerOnSharedPreferenceChangeListener(this);
        }

        @Override
        public void onPause() {
            super.onPause();
            getPreferenceManager().getSharedPreferences()
                    .unregisterOnSharedPreferenceChangeListener(this);
        }

        @Override
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
            if (key.equals("dark_mode")) {
                boolean isDarkModeEnabled = sharedPreferences.getBoolean(key, false);
                int mode = isDarkModeEnabled
                        ? AppCompatDelegate.MODE_NIGHT_YES
                        : AppCompatDelegate.MODE_NIGHT_NO;
                AppCompatDelegate.setDefaultNightMode(mode);
                getActivity().recreate();
            }
        }
    }
}
