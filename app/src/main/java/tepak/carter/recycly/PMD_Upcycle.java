package tepak.carter.recycly;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PMD_Upcycle extends AppCompatActivity {
    Button button;
    ImageView upcycleimg;
    int i=1;
    String imgname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmd__upcycle);
        button = (Button) findViewById(R.id.button3);
        upcycleimg = (ImageView) findViewById(R.id.imageView6);

        button.setOnClickListener(

                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        i=i+1;
                        int j = getResources().getIdentifier("upcycle"+i, "drawable", getPackageName());
                        imgname="R.drawable.upcycle"+i;
                        upcycleimg.setImageResource(j);

                        System.out.println("i = "+i);
                        if (i==3){
                            i=0;
                        }
                        System.out.println("PAOK __"+j);
                    }
                });
    }
}
