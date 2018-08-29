package com.example.johnny.listaspersonalizadas;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorPersona extends BaseAdapter {
    Context miContexto;
    ArrayList<Persona>personas;

    public AdaptadorPersona(Context miContexto, ArrayList<Persona> personas) {
        this.miContexto = miContexto;
        this.personas = personas;

    }

    public int getCount() {
        return personas.size();

    }

    @Override
    public Persona getItem(int position) {
        return personas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    if( convertView==null )
        convertView= LayoutInflater.from(miContexto).inflate(R.layout.item_persona,parent,false);

        TextView txtnombre = convertView.findViewById(R.id.tv_item_persona_nombre);
        TextView txtdireccion = convertView.findViewById(R.id.tv_item_persona_direccion);
        TextView txtcedula = convertView.findViewById(R.id.tv_item_persona_cedula);
        TextView txttelefono = convertView.findViewById(R.id.tv_item_persona_telefono);
        TextView txtedad = convertView.findViewById(R.id.tv_item_persona_edad);
        ImageView foto=convertView.findViewById(R.id.imagen1);
        Persona p=personas.get(position);
        txtnombre.setText(p.getNommbre().toString());
        txtdireccion.setText(p.getDireccion().toString());
        txtcedula.setText(p.getCedula().toString());
        txtedad.setText(String.valueOf(p.getEdad()));
        txttelefono.setText(p.getTelefono().toString());



        return convertView;
    }
}
