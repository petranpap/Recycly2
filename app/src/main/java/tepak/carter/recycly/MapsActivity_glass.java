package tepak.carter.recycly;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
import com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * This demo shows how GMS Location can be used to check for changes to the users location.  The
 * "My Location" button uses GMS Location to set the blue dot representing the users location.
 * Permission for {@link android.Manifest.permission#ACCESS_FINE_LOCATION} is requested at run
 * time. If the permission has not been granted, the Activity is finished with an error message.
 */
public class MapsActivity_glass extends AppCompatActivity
        implements
        OnMyLocationButtonClickListener,
        OnMyLocationClickListener,
        OnMapReadyCallback,
        ActivityCompat.OnRequestPermissionsResultCallback {

    /**
     * Request code for location permission request.
     *
     * @see #onRequestPermissionsResult(int, String[], int[])
     */
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;

    /**
     * Flag indicating whether a requested permission has been denied after returning in
     * {@link #onRequestPermissionsResult(int, String[], int[])}.
     */
    private boolean mPermissionDenied = false;

    private GoogleMap mMap;
    private Marker PMD1;
    private Marker PMD2;
    String map_title ;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_glass);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_paper);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        mMap = map;
        map_title = getResources().getString(R.string.glass_recycle_bin);
        mMap.setOnMyLocationButtonClickListener(this);
        mMap.setOnMyLocationClickListener(this);
        enableMyLocation();
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(new LatLng(34.675452, 33.043187) , 12.0f) );
        //Ypsonas
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6918639,32.9552280))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6906100,32.9556500))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6910100,32.9584600))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6881699,32.9662399))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6880300,32.9777199))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6820099,32.9734399))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        //Pano Polemidia
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6950700,32.9839200))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7045839,32.9894610))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6969099,32.9909100))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6930399,32.9900399))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6930599,32.9917099))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7011300,33.0001180))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6924699,32.9989199))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6929699,33.0027699))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6901369,32.9985839))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6886750,33.0093680))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        //Agia Fyla
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7023170,33.0045359))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6973099,33.0111299))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7049480,33.0065339))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7025600,33.0084599))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7021499,33.0183))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7052699,33.0246800))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7190399,33.0186199))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        //Agios Athanasios
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7073000,33.0369400))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7094000,33.0382100))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7089300,33.0440199))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7125500,33.0410200))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7134769,33.0500989))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7160899,33.0554400))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7130500,33.0614500))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7111439,33.0597340))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7092300,33.0633499))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7118000,33.0681300))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        //Germasogia
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7011419,33.0937459))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7005900,33.0924999))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7013100,33.0881299))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7039100,33.0852730))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7026799,33.0801899))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6956299,33.0896799))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6951770,33.0866460))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6932899,33.0853800))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6959400,33.0805200))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7000899,33.0758500))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6984899,33.0725799))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6966840,33.0691880))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6952000,33.0668600))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6915700,33.0675799))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7016000,33.0615800))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6904500,33.0745500))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6894360,33.0715020))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6895169,33.0698950))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
//Limassol ( Kentro)
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6915700,33.0675799))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6910300,33.0640100))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6895000,33.0644899))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6930199,33.0617500))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6895199,33.0614600))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6874930,33.0632729))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6856100,33.0611800))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6891599,33.0588))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6857680,33.0584120))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6891699,33.0561599))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6859140,33.0553220))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6856699,33.0474600))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6901100,33.0503269))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6940799,33.0520900))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7010299,33.0499200))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7007599,33.0480700))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7021699,33.0458699))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.7038199,33.0483800))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.70189,33.0393899))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6940000,33.0344500))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6892900,33.0383100))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6885100,33.0369200))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6869059,33.0376099))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6854799,33.0352899))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6818980,33.0408050))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6818459,33.0438209))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6799359,33.0461539))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6797109,33.0447089))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        //
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6799099,33.0527200))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6776500,33.0484299))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6772100,33.0444199))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6751979,33.0456050))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6749399,33.0443600))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6734500,33.0456500))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6736610,33.0435739))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6733690,33.0437269))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6711600,33.0424999))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6717700,33.0416590))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6734139,33.0422199))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6743029,33.0424850))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6755370,33.0433429))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6753999,33.0404399))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6748370,33.0429999))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6749029,33.0435990))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6749029,33.0435990))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6749299,33.0436210))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6761930,33.0423530))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6766629,33.0436330))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6778970,33.0351840))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6741639,33.0289769))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6694499,33.0294500))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));


//OMONOIAS
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6627000,33.0163610))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6623810,33.0139509))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.660693,33.0109860))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.660693,33.0109860))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6693399,33.0084299))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6708700,32.9968200))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6612439,33.0037349))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6569630,33.0045750))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6556700,33.0007399))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.6568519,33.0167850))
                .title(map_title))
                .setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.paper_recycle));






        control();




    }

    /**
     * Enables the My Location layer if the fine location permission has been granted.
     */
    private void enableMyLocation() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            // Permission to access the location is missing.
            PermissionUtils.requestPermission(this, LOCATION_PERMISSION_REQUEST_CODE,
                    Manifest.permission.ACCESS_FINE_LOCATION, true);


        } else if (mMap != null) {
            // Access to the location has been granted to the app.
            mMap.setMyLocationEnabled(true);




        }
    }

    @Override
    public boolean onMyLocationButtonClick() {
//        Toast.makeText(this, "MyLocation button clicked", Toast.LENGTH_SHORT).show();
        // Return false so that we don't consume the event and the default behavior still occurs
        // (the camera animates to the user's current position).

        return false;

    }

    @Override
    public void onMyLocationClick(@NonNull Location location) {
        Toast.makeText(this, "Current location:\n" + location, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        if (requestCode != LOCATION_PERMISSION_REQUEST_CODE) {
            return;
        }

        if (PermissionUtils.isPermissionGranted(permissions, grantResults,
                Manifest.permission.ACCESS_FINE_LOCATION)) {
            // Enable the my location layer if the permission has been granted.
            enableMyLocation();
        } else {
            // Display the missing permission error dialog when the fragments resume.
            mPermissionDenied = true;
        }
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        if (mPermissionDenied) {
            // Permission was not granted, display error dialog.
            showMissingPermissionError();
            mPermissionDenied = false;
        }
    }

    /**
     * Displays a dialog with error message explaining that the location permission is missing.
     */
    private void showMissingPermissionError() {
        PermissionUtils.PermissionDeniedDialog
                .newInstance(true).show(getSupportFragmentManager(), "dialog");
    }
    public boolean control(){

        LocationManager locManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        if (locManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
            //GPS enabled
            System.out.println("GPSON");
            return true;
        }

        else{
            //GPS disabled
            System.out.println("GPSOFF");
            Toast.makeText(this, "Please Enable Location \n", Toast.LENGTH_LONG).show();
            Thread timerThread = new Thread(){
                public void run(){
                    try{
                        sleep(2000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }finally{
                        System.out.println("GPSOFF");
                    }
                }
            };
            timerThread.start();
            Intent settings = new Intent("com.google.android.gms.location.settings.GOOGLE_LOCATION_SETTINGS");
            startActivity(settings);
            return false;
        }
    }


}