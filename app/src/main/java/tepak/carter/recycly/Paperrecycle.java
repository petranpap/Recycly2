package tepak.carter.recycly;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import static java.lang.Thread.sleep;


public class Paperrecycle extends AppCompatActivity {
    ImageButton gpsbuttonpaper;
    EditText myEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paperrecycle);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        gpsbuttonpaper = (ImageButton) findViewById(R.id.gpsbuttonpaper);
        myEditText   = (EditText)findViewById(R.id.getpocode);
        gpsbuttonpaper.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Context context = getApplicationContext();
                        final String text =  myEditText.getText().toString();
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                        Thread timerThread = new Thread(){
                            public void run(){
                                try{
                                    sleep(2000);
                                }catch(InterruptedException e){
                                    e.printStackTrace();
                                }finally{
                                    Intent intent = new Intent(Paperrecycle.this,Paperdoortodoor.class);
                                    intent.putExtra("mytext",text);
                                    startActivity(intent);
                                }
                            }
                        };
                        timerThread.start();
                    }
                });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {


                //get selected value here
                String itemStr = spinner.getSelectedItem().toString();
                int itempos = spinner.getSelectedItemPosition();
                if(itemStr != null && !itemStr.isEmpty()) {
                    //put selected vale and start new activity
                    Intent mIntent = new Intent(Paperrecycle.this, Paperdoortodoor.class);
                    mIntent.putExtra("data", itemStr);
                    mIntent.putExtra("position", itempos);
                    startActivity(mIntent);
                }
//
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });


    }

}