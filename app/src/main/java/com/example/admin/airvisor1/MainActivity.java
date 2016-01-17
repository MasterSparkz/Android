package com.example.admin.airvisor1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//Added
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    private RadioGroup radGrp1;
    private RadioButton direction;

    private RadioGroup radGrp2;
    private RadioButton intensity;

    private Button send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //========================================================================================
        radGrp1 = (RadioGroup)findViewById(R.id.radioGroup);
        radGrp2 = (RadioGroup)findViewById(R.id.radioGroup1);

        send = (Button)findViewById(R.id.SendBtn);

        radGrp1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //find which radio button is selected
                if(checkedId == R.id.Left){
            }


        }

    });
        direction = (RadioButton) findViewById(R.id.radioGroup);
        intensity = (RadioButton) findViewById(R.id.radioGroup1);
        String msg = direction+intensity;




        //=========================================================================================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
