package tepak.carter.recycly;


import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.os.Build;
import android.provider.CalendarContract;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Date;


@RequiresApi(api = Build.VERSION_CODES.N)
public class Paperdoortodoor extends AppCompatActivity {

    TextView mTextview;
    int mTextviewNew = 0;
    TextView TextDoortoDoor;
    ImageButton Add_calendar;
    TextView calendar_text;
    //    int year =2017;
//    int month=Calendar.MONTH;
//    int day=Calendar.DAY_OF_WEEK -1;
    Calendar calendar = Calendar.getInstance();
    int day = calendar.get(Calendar.DATE);
    int month =calendar.get(Calendar.MONTH);
    int year = calendar.get(Calendar.YEAR);




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paperdoortodoor);
        TextDoortoDoor = (TextView) findViewById(R.id.textView6);
        Add_calendar=(ImageButton) findViewById(R.id.imageButton2);
        calendar_text=(TextView) findViewById(R.id.textView7);


        //It puts Dynamically the Postal Code and the Muncipallity Name to each textView
        final TextView textPodynamic = (TextView) findViewById(R.id.textView9);
        final TextView muncipality = (TextView) findViewById(R.id.textView10);
        mTextview = (TextView) findViewById(R.id.textView8);
        //It gets the mytext from the PAperRecycle Activity , it is what the user writes (Postal Code) in the input field
        mTextview.setText(getIntent().getStringExtra("mytext"));
        try {
            mTextviewNew = Integer.parseInt(mTextview.getText().toString());
        } catch (NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }
        System.out.println(mTextviewNew);
        if ((mTextviewNew > 3019) && (mTextviewNew < 3081)){
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Thursday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_A));
        }
        else if ((mTextviewNew > 3082) && (mTextviewNew < 3104)){
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Friday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_B));
        }
        else if ((mTextviewNew >= 3105) && (mTextviewNew < 3117)){
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Monday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_C));
        }
        else if ((mTextviewNew ==3117) || (mTextviewNew == 3116)){
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Sunday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_D));
        }
        else if ((mTextviewNew > 3999) && (mTextviewNew < 4007)) {
            System.out.println("PO : " + mTextviewNew);
            //Then We set each text to write the correct NIght that the truck passes by (Podynamic) and the correct Muncipallity(muncipality)
            textPodynamic.setText(getString(R.string.Sunday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Mesa_Geitonia));
        } else if ((mTextviewNew > 4039) && (mTextviewNew < 4050)) {
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Tuesday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Germasogeia));

        }else if ((mTextviewNew > 4099) && (mTextviewNew < 4109)) {
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Monday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Agios_Athanasios));
        }else if ((mTextviewNew > 4149) && (mTextviewNew < 4171)) {
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Wednesday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Kato_Polemidia));
        }else if ((mTextviewNew == 4527) || (mTextviewNew  == 4531)) {
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Tuesday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Mouttagiaka));
        }else if ((mTextviewNew > 4520) && (mTextviewNew < 4533)) {
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Tuesday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Agios_Tychon));
        }else if ((mTextviewNew == 4130) || (mTextviewNew  == 4131)) {
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Wednesday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Pano_Polemidia));
        }
        else if ((mTextviewNew > 4179) && (mTextviewNew < 4195)) {
            System.out.println("PO : " + mTextviewNew);
            textPodynamic.setText(getString(R.string.Sunday));

            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Ypsonas));

        }
        else {
            System.out.println("PO : " + mTextviewNew);
            calendar_text.setVisibility(View.INVISIBLE);
            Add_calendar.setVisibility(View.INVISIBLE);

            muncipality.setText(getString(R.string.Select_again));

        }


        Intent i = getIntent();
        String dataString = i.getStringExtra("data");
        //HEre it parse the position from the spinner ( 1 Agios Athanasios , 2 Agios Tychon ...)
        final Integer pos=getIntent().getIntExtra("position",0);
//        Context context = getApplicationContext();
//                CharSequence text = dataString;
//                int duration = Toast.LENGTH_SHORT;
////
//                Toast toast = Toast.makeText(context, text, duration);
//                toast.show();
        switch(pos) {
            case 1 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Monday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Agios_Athanasios));
                break; // optional

            case 2 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Tuesday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Agios_Tychon));
                break; // optional
            case 3 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Tuesday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Germasogeia));
                break; // optional
            case 4 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Thursday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_A));
                break; // optional
            case 5 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Friday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_B));
                break; // optional
            case 6 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Monday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);

                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_C));
                break; // optional
            case 7 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Sunday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_D));
                break; //
            case 8 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Sunday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Mesa_Geitonia));
                break; // optional
            case 9 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Tuesday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Mouttagiaka));
                break; // optional
            case 10 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Wednesday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Kato_Polemidia));
                break; // optional
            case 11 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Wednesday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Pano_Polemidia));
                break; // optional
            case 12 :
                TextDoortoDoor.setVisibility(View.INVISIBLE);
                textPodynamic.setText(getString(R.string.Sunday));
                calendar_text.setVisibility(View.VISIBLE);
                Add_calendar.setVisibility(View.VISIBLE);
                muncipality.setText(getString(R.string.Municipality)+getString(R.string.Ypsonas));
                break; // optional


            default : // Optional

        }
        //Add to calendar
        Add_calendar.setOnClickListener(
                new View.OnClickListener()
                {
                    @RequiresApi(api = Build.VERSION_CODES.N)
                    public void onClick(View view)
                    {
                        Intent calIntent = new Intent(Intent.ACTION_INSERT);
                        calIntent.setType("vnd.android.cursor.item/event");
                        calIntent.putExtra(CalendarContract.Events.TITLE, getString(R.string.next_coll));
                        calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "");
                        calIntent.putExtra(CalendarContract.Events.DESCRIPTION, "");
                        calIntent.putExtra(CalendarContract.Events.RRULE, "FREQ=WEEKLY;INTERVAL=1");
                        Calendar calDate = Calendar.getInstance();
                        calDate.set(year, month, day);

                        //FROM THE IF
                        if ((mTextviewNew > 3019) && (mTextviewNew < 3081)){
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Thursday));

                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_A));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }

                        }
                        else if ((mTextviewNew > 3082) && (mTextviewNew < 3104)){
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Friday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_B));
                        }
                        else if ((mTextviewNew >= 3105) && (mTextviewNew < 3117)){
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Monday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_C));
                        }
                        else if ((mTextviewNew ==3117) || (mTextviewNew == 3116)){
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Sunday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Limassol_Sector_D));
                        }
                        else if ((mTextviewNew > 3999) && (mTextviewNew < 4007)) {
                            System.out.println("PO : " + mTextviewNew);
                            //Then We set each text to write the correct NIght that the truck passes by (Podynamic) and the correct Muncipallity(muncipality)
                            textPodynamic.setText(getString(R.string.Sunday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Mesa_Geitonia));
                        } else if ((mTextviewNew > 4039) && (mTextviewNew < 4050)) {
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Tuesday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Germasogeia));

                        }else if ((mTextviewNew > 4099) && (mTextviewNew < 4109)) {
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Monday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Agios_Athanasios));
                        }else if ((mTextviewNew > 4149) && (mTextviewNew < 4171)) {
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Wednesday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.WEDNESDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Kato_Polemidia));
                        }else if ((mTextviewNew == 4527) || (mTextviewNew  == 4531)) {
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Tuesday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Mouttagiaka));
                        }else if ((mTextviewNew > 4520) && (mTextviewNew < 4533)) {
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Tuesday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Agios_Tychon));
                        }else if ((mTextviewNew == 4130) || (mTextviewNew  == 4131)) {
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Wednesday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.WEDNESDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Pano_Polemidia));
                        }
                        else if ((mTextviewNew > 4179) && (mTextviewNew < 4195)) {
                            System.out.println("PO : " + mTextviewNew);
                            textPodynamic.setText(getString(R.string.Sunday));
                            while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                                calDate.add(Calendar.DATE, 1);
                            }


                            muncipality.setText(getString(R.string.Municipality)+getString(R.string.Ypsonas));

                        }





                        //FROM THE DROPDOWN
                        switch(pos) {
                            case 1 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional

                            case 2 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional
                            case 3 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional
                            case 4 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional
                            case 5 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional
                            case 6 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional
                            case 7 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; //
                            case 8 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional
                            case 9 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional
                            case 10 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.WEDNESDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional
                            case 11 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.WEDNESDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional
                            case 12 :
                                while (calDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                                    calDate.add(Calendar.DATE, 1);
                                }
                                break; // optional


                            default : // Optional

                        }

//                        GregorianCalendar calDate = new GregorianCalendar(year, month, day );

                        System.out.println(calDate.getTime());

                        System.out.println("DAY :: -->  "+day);
                        System.out.println("YEAR :: -->  "+year);
                        System.out.println("MONTH :: -->  "+month);



                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                                calDate.getTimeInMillis());
                        calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                                calDate.getTimeInMillis());

                        startActivity(calIntent);


                    }
                });

    }

}
