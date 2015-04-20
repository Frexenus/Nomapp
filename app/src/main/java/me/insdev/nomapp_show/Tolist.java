package me.insdev.nomapp_show;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;



public class Tolist extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tolist);
        ImageButton CHEB = (ImageButton) this.findViewById(R.id.imageButton4);
        ImageButton OML = (ImageButton) this.findViewById(R.id.imageButton5);
        ImageButton YAY = (ImageButton) this.findViewById(R.id.imageButton6);
        if(DisplayMessageActivity.DishCount == 2){
            OML.setVisibility(View.VISIBLE);
            YAY.setVisibility(View.VISIBLE);
        }
        if (DisplayMessageActivity.DishCount == 3 ){
            CHEB.setVisibility(View.VISIBLE);
            OML.setVisibility(View.VISIBLE);
            YAY.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tolist, menu);
        return true;
    }

    public void toyay(View View){
        Intent intent = new Intent(this, first_recepie.class);
        startActivity(intent);

    }
    public void tooml(View View){
        Intent intent = new Intent(this, second_recepie.class);
        startActivity(intent);

    }
    public void tocheb(View View){
        Intent intent = new Intent(this, third_recepie.class);
        startActivity(intent);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
