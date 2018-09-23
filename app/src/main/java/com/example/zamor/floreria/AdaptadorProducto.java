package com.example.zamor.floreria;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorProducto extends ArrayAdapter {
    private Context context;
    private ArrayList<Producto> producto;

    public AdaptadorProducto(Context context, ArrayList<Producto> producto){
        super(context,R.layout.item);
        this.context = context;
        this.producto = producto;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemm = layoutInflater.inflate(R.layout.item,null);

        ImageView imageView = (ImageView)itemm.findViewById(R.id.lvProducto);
        imageView.setImageResource(producto.get(position).getImage());

        TextView tvNombre = (TextView) itemm.findViewById(R.id.tvProduct);
        tvNombre.setText(producto.get(position).getNombre());

        TextView tvCosto = (TextView) itemm.findViewById(R.id.tvCosto);
        tvCosto.setText(""+ producto.get(position).getCosto());

        return itemm;
    }
}
