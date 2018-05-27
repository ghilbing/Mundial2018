package com.hilbing.wc2018.mundial2018.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.hilbing.wc2018.mundial2018.R;
import com.hilbing.wc2018.mundial2018.model.Stadium;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StadiumsAdapter extends RecyclerView.Adapter<StadiumsAdapter.ViewHolder> {

    public ArrayList<Stadium> mList;
    private Context context;

    public StadiumsAdapter(Context context, ArrayList<Stadium> mList) {
        this.mList = mList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stadium, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.id.setText(String.valueOf(mList.get(position).getId()));
        holder.name.setText(mList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.id_stadium)
        TextView id;
        @BindView(R.id.name_stadium)
        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
