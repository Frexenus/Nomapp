package me.insdev.nomapp_show;

import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;


public class DisplayMessageActivity extends Activity {

    static int DishCount;
    String DishCountOfStr = String.valueOf(DishCount);


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        CheckBox chbx = (CheckBox) this.findViewById(R.id.checkBox2);
        chbx.setOnClickListener(listenner);

        CheckBox chbx4 = (CheckBox) this.findViewById(R.id.checkBox6);
        chbx4.setOnClickListener(listenner);


    }

    public void tolist(View View){
        Intent intent = new Intent(this, Tolist.class);

        startActivity(intent);
    }
    public void func() {

        TextView tt = (TextView) this.findViewById(R.id.textView);
        CheckBox chbx = (CheckBox) this.findViewById(R.id.checkBox);
        CheckBox chbx2 = (CheckBox) this.findViewById(R.id.checkBox2);
        CheckBox chbx3 = (CheckBox) this.findViewById(R.id.checkBox3);
        CheckBox chbx4 = (CheckBox) this.findViewById(R.id.checkBox4);
        CheckBox chbx5 = (CheckBox) this.findViewById(R.id.checkBox6);
        ImageButton TOLIST = (ImageButton) this.findViewById(R.id.imageButton3);

        if (chbx2.isChecked()) {
            tt.setText(((Integer.parseInt(tt.getText().toString()) + 2)) + "");
            DishCount = 2;
        }

        if (chbx5.isChecked()) {
            tt.setText(((Integer.parseInt(tt.getText().toString()) -1)) + "");
            DishCount = 3;
        }
    }

    View.OnClickListener listenner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            func();
        }
    };



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
        return true;
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
