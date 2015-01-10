package iit2.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class settingpage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingpage);
        //This opens a link
        TextView mLink = (TextView) findViewById(R.id.helpoption);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }

    }
    //Function called when Feedback is pressed
    public void sendfeedback(View view) {
        Intent email = new Intent(android.content.Intent.ACTION_SEND);
        email.setType("text/html");
        //  email.putExtra(Intent.EXTRA_CC,new String[]{"Your CC Mail ID"});
        //CHange Id here
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"tchinmai7@gmail.com"});
        email.putExtra(android.content.Intent.EXTRA_SUBJECT, "FeedBack");
        startActivity(email);
    }

    //THis function creates an intent to bind 'settings' and 'about' activites
    public void openaboutpage(View view)
    {
        Intent intent = new Intent();
        intent.setClass(this,aboutpage.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
     //   getMenuInflater().inflate(R.menu.settingpage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
