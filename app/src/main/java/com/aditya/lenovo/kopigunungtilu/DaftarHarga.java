package com.aditya.lenovo.kopigunungtilu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarHarga extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterDaftarHarga adapter;
    private ArrayList<ModelHarga> ModelHargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_harga);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new AdapterDaftarHarga(ModelHargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarHarga.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        ModelHargaArrayList = new ArrayList<>();
        //arabica,gb,natural
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Natural","100gr","3000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Natural","250gr","6000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Natural","500gr","9000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Natural","1000gr","10000"));
        //arabica,gb,honey
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Honey","100gr","8000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Honey","250gr","13000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Honey","500gr","18000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Honey","1000gr","25000"));
        //arabica,gb,wet
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Wet","100gr","4000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Wet","250gr","8000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Wet","500gr","14000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Wet","1000gr","20000"));
        //arabica,gb,Dry
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Dry","100gr","5000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Dry","250gr","10000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Dry","500gr","15000"));
        ModelHargaArrayList.add(new ModelHarga("Arabica", "Grean Bean", "Dry","1000gr","24000"));






    }
}
