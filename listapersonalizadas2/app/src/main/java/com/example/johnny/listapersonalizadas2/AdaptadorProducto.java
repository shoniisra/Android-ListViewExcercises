package com.example.johnny.listapersonalizadas2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorProducto extends BaseAdapter { Context miContexto;
    ArrayList<Producto> productos;

    public AdaptadorProducto(Context miContexto, ArrayList<Producto> productos) {
        this.miContexto = miContexto;
        this.productos = productos;

    }

    public int getCount() {
        return productos.size();

    }

    public Producto getItem(int position) {
        return productos.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if( convertView==null )
            convertView= LayoutInflater.from(miContexto).inflate(R.layout.item_lista,parent,false);

        TextView txtnombre = convertView.findViewById(R.id.tv_item_persona_nombre);
        TextView txtdescripcion = convertView.findViewById(R.id.tv_item_persona_descripcion);
        TextView txtunidad = convertView.findViewById(R.id.tv_item_persona_unidad);
        TextView txtprecio = convertView.findViewById(R.id.tv_item_persona_precio);

        ImageView foto=convertView.findViewById(R.id.imagen1);

        Producto p=productos.get(position);
        txtnombre.setText(p.getNommbre().toString());
        txtdescripcion.setText(p.getDescripcion().toString());
        txtunidad.setText(p.getUnidad().toString());

        txtprecio.setText(String.valueOf(p.getPrecio()));




        return convertView;
    }
}
