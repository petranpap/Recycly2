package tepak.carter.recycly;

/**
 * Created by Petran on 9/18/2017.
 */
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Tab1recycle extends Fragment {
    ImageView pmdImg;
    ImageView glassImg;
    ImageView paperImg;
    ImageView otherImg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1recycle, container, false);
        return rootView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        // get the button view
        pmdImg = (ImageView) getView().findViewById(R.id.imageView1);
        // set a onclick listener for when the button gets clicked
        pmdImg.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        Pmdrecycle.class);
                startActivity(mainIntent);
            }
        });

        glassImg = (ImageView) getView().findViewById(R.id.imageView2);
        // set a onclick listener for when the button gets clicked
        glassImg.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),
                        MapsActivity_glass.class));
            }
        });
        paperImg = (ImageView) getView().findViewById(R.id.imageView3);
        // set a onclick listener for when the button gets clicked
        paperImg.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
//                Intent mainIntent = new Intent(getActivity(),
//                        Glassrecycle.class);
                startActivity(new Intent(getActivity(),
                        Paperrecycle.class));
            }
        });
        otherImg = (ImageView) getView().findViewById(R.id.imageView4);
        // set a onclick listener for when the button gets clicked
        otherImg.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
//                Intent mainIntent = new Intent(getActivity(),
//                        Glassrecycle.class);
                startActivity(new Intent(getActivity(),
                        Other_recycle.class));
            }
        });
    }

}
