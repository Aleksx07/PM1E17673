package hn.uth.pm1e17673;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btnContacto, btnList, btnaddButton;
    Spinner comboPais;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Creacion de los listener de los botones */
        btnContacto = (Button) findViewById(R.id.btnContacto);
        btnList = (Button) findViewById(R.id.btnList);
        btnaddButton = (Button) findViewById(R.id.btnaddButton);

        comboPais = (Spinner) findViewById(R.id.Spinner);

        /* Relleno del control de números con las elecciones del usuario */

        Spinner spinner = (Spinner) findViewById(R.id.Spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        btnaddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String nuevoElemento = "Nuevo Elemento";
                    adapter.add(nuevoElemento);
                    adapter.notifyDataSetChanged();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        View.OnClickListener butonclick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class<?> actividad = null;

                if (view.getId() == R.id.btnList) {
                    actividad = ActivityList.class;
                }
                if (actividad != null){
                    NoveActivity(actividad);
                }

            }
        };

        btnContacto.setOnClickListener(butonclick);
        btnList.setOnClickListener(butonclick);


    }

    private void NoveActivity( Class<?> actividad) {
        Intent intent = new Intent(getApplicationContext(), actividad);
        startActivity(intent);
    }
}