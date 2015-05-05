package com.example.familia.lab2_punto4;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import java.lang.Object;


public class MainActivity extends ActionBarActivity {
    private int opc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void method1(View view) {
        switch (view.getId()) {
            case (R.id.rcuad):
                opc = 1;
                break;
            case (R.id.rtriang):
                opc = 2;
                break;
            case (R.id.rcirc):
                opc = 3;
                break;
            case (R.id.rrect):
                opc = 4;
                break;
        }
    }

    public void method(View view) {
        final EditText _base = (EditText) findViewById(R.id.ebase);
        final EditText _altura = (EditText) findViewById(R.id.ealtura);
        final EditText _radio = (EditText) findViewById(R.id.eradio);
        final EditText _lado = (EditText) findViewById(R.id.elado);
        final EditText result = (EditText) findViewById(R.id.eresult);

        final String base1 = _base.getText().toString();
        final String altura1 = _base.getText().toString();
        final String radio1 = _base.getText().toString();
        final String lado1 = _base.getText().toString();
        double base, altura, radio, lado, area;

        base = Double.valueOf(_base.getText().toString());
        altura = Double.valueOf(_altura.getText().toString());
        radio = Double.valueOf(_radio.getText().toString());
        lado = Double.valueOf(_lado.getText().toString());
        if (base1.length() == 0 || altura1.length() == 0 || radio1.length() == 0 || lado1.length() == 0) {
            result.setText("ingrese valores.");
        } else {
            switch (opc) {
                case 1:
                    if (lado1.length() == 0) {
                        result.setText("no hay valores.");
                    } else {
                        area = lado * lado;
                        result.setText(String.valueOf(area));
                    }
                    break;
                case 4:
                    if (base1.length() == 0 || altura1.length() == 0) {
                        result.setText("no hay valores.");
                    } else {
                        area = base * altura;
                        result.setText(String.valueOf(area));
                    }
                    break;
                case 2:
                    if (base1.length() == 0 || altura1.length() == 0) {
                        result.setText("no hay valores.");
                    } else {
                        area = (base * altura) / 2;
                        result.setText(String.valueOf(area));
                    }
                    break;
                case 3:
                    if (radio1.length() == 0) {
                        result.setText("no hay valores.");
                    } else {
                        area = 3.159 * radio * radio;
                        result.setText(String.valueOf(area));
                    }
                    break;
            }
        }
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