package tepak.carter.recycly;

import java.util.Locale;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class LangSelect extends Activity {
    Spinner spinnerctrl;
    Button btn;
    Locale myLocale;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        SharedPreferences sharedPref = getSharedPreferences("mypref", 0);
        String myLocale = sharedPref.getString("myLocale", "");
        System.out.println("Locale --> " + myLocale);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang_select);
        if (myLocale==null) {
            spinnerctrl = (Spinner) findViewById(R.id.spinner1);
            spinnerctrl.setOnItemSelectedListener(new OnItemSelectedListener() {

                public void onItemSelected(AdapterView<?> parent, View view,
                                           int pos, long id) {

                    System.out.println("Position --> " + pos);

                    if (pos == 1) {

                        Toast.makeText(parent.getContext(),
                                "You have selected Greek", Toast.LENGTH_SHORT)
                                .show();
                        setLocale("el");
                        System.out.println("Position --> " + pos);
                    } else if (pos == 2) {

                        Toast.makeText(parent.getContext(),
                                "You have selected English", Toast.LENGTH_SHORT)
                                .show();
                        setLocale("en");
                        System.out.println("Position --> " + pos);
                    } else if (pos == 3) {

                        Toast.makeText(parent.getContext(),
                                "You have selected Arabic", Toast.LENGTH_SHORT)
                                .show();
                        System.out.println("Position --> " + pos);
                        setLocale("ar");
                    } else if (pos == 4) {

                        Toast.makeText(parent.getContext(),
                                "You have selected French", Toast.LENGTH_SHORT)
                                .show();
                        setLocale("fr");
                        System.out.println("Position --> " + pos);
                    }

                }

                public void onNothingSelected(AdapterView<?> arg0) {
                    // TODO Auto-generated method stub
                }

            });
        }else{
            setLocale(myLocale);
            Intent refresh = new Intent(this, MainActivity.class);
            startActivity(refresh);
        }
    }

    public void setLocale(String lang) {

        myLocale = new Locale(lang);
        // Create object of SharedPreferences.
        SharedPreferences sharedPref= getSharedPreferences("mypref", 0);
        //now get Editor
        SharedPreferences.Editor editor= sharedPref.edit();
        //put your value
        editor.putString("myLocale", String.valueOf(myLocale));
        //commits your edits
        editor.commit();
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();

        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent go_to_main = new Intent(this, MainActivity.class);
        startActivity(go_to_main);
    }
}
