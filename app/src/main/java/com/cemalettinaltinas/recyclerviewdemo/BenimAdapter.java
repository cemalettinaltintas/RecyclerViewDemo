package com.cemalettinaltinas.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BenimAdapter extends RecyclerView.Adapter<BenimAdapter.BenimViewHolder> {
    Context context;
    ArrayList<Meyve> meyveArrayList;

    public BenimAdapter(Context context, ArrayList<Meyve> meyveArrayList) {
        this.context = context;
        this.meyveArrayList = meyveArrayList;
    }

    @NonNull
    @Override
    public BenimAdapter.BenimViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.benim_satir,parent,false);
        return new BenimViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BenimAdapter.BenimViewHolder holder, int position) {
        holder.meyveAdiText.setText(meyveArrayList.get(position).meyveAdi);
        holder.meyveResim.setImageResource(meyveArrayList.get(position).meyveResim);
    }

    @Override
    public int getItemCount() {
        return meyveArrayList.size();
    }
    public class BenimViewHolder extends RecyclerView.ViewHolder{
        TextView meyveAdiText;
        ImageView meyveResim;

        public BenimViewHolder(@NonNull View itemView) {
            super(itemView);
            meyveAdiText=itemView.findViewById(R.id.meyveAdi);
            meyveResim=itemView.findViewById(R.id.imageView);
        }
    }
}
