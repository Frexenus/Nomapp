package me.insdev.nomapp_show;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.Window;
import android.content.Intent;
import android.widget.EditText;

public class Start_Screen extends Activity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__screen);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();




        return super.onOptionsItemSelected(item);
    }

    public void sendmessage(View View){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);

    }
    public void TopRecepies(View View){
        Intent intent = new Intent(this, TopRecActivity.class);

        startActivity(intent);
    }
    public void Chiefs(View View){
        Intent intent = new Intent(this, ChiefsActivity.class);

        startActivity(intent);
    }

}
