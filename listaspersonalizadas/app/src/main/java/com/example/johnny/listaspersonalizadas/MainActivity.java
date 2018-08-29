package com.example.johnny.listaspersonalizadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lst_persona=findViewById(R.id.lv_persona);
        final ArrayList<Persona> listaPersona=new ArrayList<Persona>();
        listaPersona.add(new Persona("q","q","q","q",23));
        listaPersona.add(new Persona("w","w","w","w",23));
        listaPersona.add(new Persona("t","t","t","t",23));
        AdaptadorPersona adpP=new AdaptadorPersona(this,listaPersona);
        lst_persona.setAdapter(adpP);
        lst_persona.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),listaPersona.get(position).getNommbre().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
