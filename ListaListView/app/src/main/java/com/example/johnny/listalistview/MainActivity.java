package com.example.johnny.listalistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import  java.util.*;

public class MainActivity extends AppCompatActivity {
ListView lstFrutas;
Button bt;
EditText txt;
Spinner sp;
    ArrayList<String> frutas = new ArrayList<String>();
    ArrayList<String> vegetales = new ArrayList<>();

    String[] listasp={"vegetales","frutas"};
    ArrayAdapter<String> adpListasp;

//String[] frutas={"pera","manzana","naranja","durazno","manzana"};
ArrayAdapter<String> adpFrutas;
ArrayAdapter<String> adpVegetales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.bt1);
        txt=findViewById(R.id.et1);
        lstFrutas=findViewById(R.id.lv1);
        sp=findViewById(R.id.sp1);

        adpListasp=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,listasp);
        sp.setAdapter(adpListasp);
        sp.setSelection(1);

        frutas.add("pera");
        frutas.add("manzana");
        frutas.add("durazno");
        frutas.add("mandarina");


        vegetales.add("brocoli");
        vegetales.add("acelga");
        vegetales.add("lechuga");
        adpVegetales=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,vegetales);
        lstFrutas.setAdapter(adpVegetales);



        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==1){
                    adpFrutas=new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,frutas);
                    lstFrutas.setAdapter(adpFrutas);
                }else{
                    adpVegetales=new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,vegetales);
                    lstFrutas.setAdapter(adpVegetales);
                }
            }
        });

        lstFrutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Selecciono: "+String.valueOf(frutas.get(position)),Toast.LENGTH_SHORT).show();
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sp.getSelectedItemPosition();
                Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_SHORT).show();
                if(position==1){
                   // Toast.makeText(getApplicationContext(),"agregado",Toast.LENGTH_SHORT).show();
                    vegetales.add(txt.getText().toString());
                    adpVegetales=new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,vegetales);
                    lstFrutas.setAdapter(adpVegetales);
                }else{
                    //Toast.makeText(getApplicationContext(),"agregado",Toast.LENGTH_SHORT).show();
                    frutas.add(txt.getText().toString());
                    adpFrutas=new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,frutas);
                    lstFrutas.setAdapter(adpFrutas);
                }


            }
        });
    }
}
