package iit2.app;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by sanjeev on 09/06/14.
 */
public class fragment extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busdeatail);

        TextView text1 = (TextView)findViewById(R.id.box5);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /*Use to start the Map_fragment*/
                Intent intent1 = new Intent(fragment.this, Map_fragment.class);
                startActivity(intent1);

            }
        });

    }
}








