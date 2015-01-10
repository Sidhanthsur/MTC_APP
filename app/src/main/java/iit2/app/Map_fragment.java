package iit2.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.location.Criteria;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

/**
 * Created by sanjeev on 11/06/14.
 */

public class Map_fragment extends FragmentActivity
{
    Location loc;
    public double latitude;
   public double longitude;
    //public LatLng LOCATION_USER = new LatLng(latitude,longitude);


    GoogleMap googleMap;

//    private final LatLng LOCATION_BURNABY = new LatLng(latitude,longitude);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
       /*
       Declaration part for the functions
        */
        LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

       LocationListener mlocListener = new MyLocationListener();

       mlocManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, mlocListener);


    }

    public class MyLocationListener implements LocationListener

    {
     @Override
/*
location update and moving the marker dynamically
 */    public void onLocationChanged(Location loc)

        {
           latitude= loc.getLatitude();
           longitude= loc.getLongitude();
        /*String Text = " My current location is: " + " Latitude =" + latitude +
                    "Longitude = " + longitude;*/
            LatLng saidapet=new LatLng(13.019563900000000000,80.224880200000030000);
            LatLng univ=new LatLng(13.0083054,80.23347349999995);
            LatLng adayar=new LatLng(13.007944800000000000,80.258667800000010000);
            LatLng depot=new LatLng(12.996927800000000000,80.256331300000050000);
            LatLng lattice=new LatLng(12.9937156,80.25595309999994);
            LatLng kandan=new LatLng(12.9653795,80.24753090000002);
            LatLng thora=new LatLng(12.938565000000000000,80.237707799999950000);

            LatLng LOCATION_USER = new LatLng(latitude,longitude);
           // LatLng source= new LatLng(12.9896234,80.2292689);
            googleMap  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
         //   googleMap.addMarker(new MarkerOptions().position(source).title("Find me here!"));
            googleMap.addMarker(new MarkerOptions().position(saidapet).title("Saidapet"));
            googleMap.addMarker(new MarkerOptions().position(univ).title("Anna University"));
            googleMap.addMarker(new MarkerOptions().position(adayar).title("Adayar bus stop"));
            googleMap.addMarker(new MarkerOptions().position(depot).title("Adayar Depot"));
            googleMap.addMarker(new MarkerOptions().position(lattice).title("Lattice Bridge"));
            googleMap.addMarker(new MarkerOptions().position(kandan).title("Kandanchavadi"));
            googleMap.addMarker(new MarkerOptions().position(thora).title("Kandanchavadi"));
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            googleMap.setMyLocationEnabled(true);
            googleMap.setTrafficEnabled(true);
            CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_USER, 16);
            googleMap.animateCamera(update);
/*
Below commented code is to test location connectivity
 */

            //Toast.makeText(getApplicationContext(),

              //     Text,

//                   Toast.LENGTH_SHORT).show();

        }

        @Override
/*
Used to check the gps status on the device.
 */
        public void onProviderDisabled(String provider)

        {

            Toast.makeText(getApplicationContext(),

                    "Gps Disabled",

                    Toast.LENGTH_SHORT).show();

        }

        @Override

        public void onProviderEnabled(String provider)

        {

            Toast.makeText(getApplicationContext(),

                    "Gps Enabled,",
                    Toast.LENGTH_SHORT).show();

        }





        @Override

        public void onStatusChanged(String provider, int status, Bundle extras)

        {

        }


    }

}

