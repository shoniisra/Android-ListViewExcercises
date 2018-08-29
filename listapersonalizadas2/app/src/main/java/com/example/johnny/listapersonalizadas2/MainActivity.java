package com.example.johnny.listapersonalizadas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    ListView lst_producto;

    final ArrayList<String> listasp=new ArrayList<String>();
    final ArrayList<Producto> vegetales=new ArrayList<Producto>();
    final ArrayList<Producto> frutas=new ArrayList<Producto>();

    ArrayAdapter<String> adpListsp;
    AdaptadorProducto adpVegetales;
    AdaptadorProducto adpFrutas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mapeo de componentes
        sp=findViewById(R.id.sp1);
        lst_producto=findViewById(R.id.lv_persona);

        //elementos del spinner
        listasp.add("vegetales");
        listasp.add("frutas");

        //adaptador del spiner
        adpListsp=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,listasp);
        sp.setAdapter(adpListsp);
        sp.setSelection(1);

        vegetales.add(new Producto("brocoli","producto ecuatoriano","unidades",50));
        vegetales.add(new Producto("hacelga","producto ecuatoriano","unidades",25));
        vegetales.add(new Producto("lechuga","producto ecuatoriano","unidades",30));



        frutas.add(new Producto("manzana","producto chileno","unidades",45));
        frutas.add(new Producto("pera","producto ecuatoriano","unidades",35));
        frutas.add(new Producto("banano","producto ecuatoriano","unidades",10));
        adpFrutas=new AdaptadorProducto(this,frutas);
        lst_producto.setAdapter(adpFrutas);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    adpVegetales=new AdaptadorProducto(getBaseContext(),vegetales);
                    lst_producto.setAdapter(adpVegetales);
                }else
                {
                    adpFrutas=new AdaptadorProducto(getBaseContext(),frutas);
                    lst_producto.setAdapter(adpFrutas);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

