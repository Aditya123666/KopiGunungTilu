package com.aditya.lenovo.kopigunungtilu;

import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
//import 'com.aditya.lenovo.kopigunungtilu.ModelHarga';

import java.util.ArrayList;

public class AdapterDaftarHarga extends RecyclerView.Adapter<AdapterDaftarHarga.ModelHargaViewHolder> {
    private ArrayList<ModelHarga> dataList;

    public AdapterDaftarHarga(ArrayList<ModelHarga> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ModelHargaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cvdaftarharga, parent, false);
        return new ModelHargaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ModelHargaViewHolder holder, int position) {
        holder.bahan.setText(dataList.get(position).getBahan());
        holder.jenis.setText(dataList.get(position).getJenis());
        holder.processing.setText(dataList.get(position).getProcessing());
        holder.size.setText(dataList.get(position).getSize());
        holder.harga.setText(dataList.get(position).getHarga());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ModelHargaViewHolder extends RecyclerView.ViewHolder{
        private TextView bahan,jenis,processing,size,harga;

        public ModelHargaViewHolder(View itemView) {
            super(itemView);
            bahan = (TextView) itemView.findViewById(R.id.tvbahan);
            jenis = (TextView) itemView.findViewById(R.id.tvjenis);
            processing = (TextView) itemView.findViewById(R.id.tvproses);
            size = (TextView) itemView.findViewById(R.id.tvukuran);
            harga = (TextView) itemView.findViewById(R.id.totalharga);
        }
    }
}
