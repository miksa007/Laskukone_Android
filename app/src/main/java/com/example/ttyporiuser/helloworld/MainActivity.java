package com.example.ttyporiuser.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;
    private Button laskeNappula;
    private TextView tulos;
    private int luku;
    final String LOG_CAT=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_CAT, "Ohjelma käynnistyy versiohallinnan lisayksen jalkeen");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editText=(EditText)findViewById(R.id.editText);

        editText2=(EditText)findViewById(R.id.editText2);

        tulos=(TextView)findViewById(R.id.textView2);
        laskeNappula=(Button)findViewById(R.id.button);
        laskeNappula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LOG_CAT, "nappulaa painettu");
                luku=Integer.parseInt(editText.getText().toString());
                luku+=Integer.parseInt(editText.getText().toString());

                Log.d(LOG_CAT, "Summa on "+luku);
                tulos.setText(""+luku);
            }
        });


    }

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
