package com.example.zamor.floreria;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    public ArrayList<Producto> productos;
    public ListView lvProductos;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_second);
        lvProductos = (ListView) findViewById(R.id.lvProducto);

        agregaElemento();
        AdaptadorProducto adaptadorProducto = new AdaptadorProducto(SecondActivity.this, productos);

        lvProductos.setAdapter(adaptadorProducto);
    }

    public void agregaElemento() {
        productos = new ArrayList<>();
        productos.add(new Producto(R.drawable.bouquet, "Rosas", 35));
        productos.add(new Producto(R.drawable.bouquet, "Rosas", 35));
        productos.add(new Producto(R.drawable.bouquet, "Rosas", 35));
        productos.add(new Producto(R.drawable.bouquet, "Rosas", 35));
        productos.add(new Producto(R.drawable.bouquet, "Rosas", 35));
        productos.add(new Producto(R.drawable.bouquet, "Rosas", 35));
        productos.add(new Producto(R.drawable.bouquet, "Rosas", 35));
    }
}