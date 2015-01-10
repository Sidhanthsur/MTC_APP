package iit2.app;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text=(TextView)findViewById(R.id.box1);

        text.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent=new Intent(MainActivity.this,fragment.class);
                                        startActivity(intent);

                                       }
                                }
        );
        TextView text1=(TextView)findViewById(R.id.box2);

        text1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent1=new Intent(MainActivity.this,fragment.class);
                                        startActivity(intent1);

                                    }
                                }
        );
        TextView text2=(TextView)findViewById(R.id.box3);

        text2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent2=new Intent(MainActivity.this,fragment.class);
                                        startActivity(intent2);

                                    }
                                }
        );
        /*For Autocomplete text and we need to change it for query*/

        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.editText);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item, COUNTRIES);
        textView.setAdapter(adapter);


        AutoCompleteTextView textView1 = (AutoCompleteTextView) findViewById(R.id.editText2);
        ArrayAdapter<String> ada = new ArrayAdapter<String>(this,
                R.layout.list_item, COUNTRIES);
        textView1.setAdapter(ada);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent intent4=new Intent(MainActivity.this,settingpage.class);
            startActivity(intent4);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    /* Array for autocomplete*/
    static final String[] COUNTRIES = new String[] { "Adyar","guindy","ambatur","avadi","ceg","svce","iit","perambur" };
}
