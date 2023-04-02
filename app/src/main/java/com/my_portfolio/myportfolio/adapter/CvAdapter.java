package com.my_portfolio.myportfolio.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my_portfolio.myportfolio.R;
import com.my_portfolio.myportfolio.cv.CvItem;

import java.util.ArrayList;
import java.util.List;

public class CvAdapter extends RecyclerView.Adapter<CvAdapter.CvViewHolder> {

    private List<CvItem> mdata;

    public CvAdapter(List<CvItem> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public CvAdapter.CvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cv,parent,false);
        return new CvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CvAdapter.CvViewHolder holder, int position) {

        CvItem item = mdata.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvDescription.setText(item.getDescription());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class CvViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle;
        private TextView tvDescription;

        public CvViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvCvDescription);
        }
    }
}
