package tepak.carter.recycly;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import static java.lang.Thread.sleep;


public class Glassrecycle extends AppCompatActivity {
    Button GoToMapsActivity_glass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glassrecycle);
        addListenerOnButton();



    }
    public void addListenerOnButton() {

        final Context context = this;

        GoToMapsActivity_glass = (Button) findViewById(R.id.button);

        GoToMapsActivity_glass.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MapsActivity_glass.class);
                startActivity(intent);

            }

        });

    }




}