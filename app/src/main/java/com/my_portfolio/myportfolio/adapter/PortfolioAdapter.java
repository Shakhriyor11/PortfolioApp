package com.my_portfolio.myportfolio.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.my_portfolio.myportfolio.R;
import com.my_portfolio.myportfolio.portfolio.PortfolioCallBack;
import com.my_portfolio.myportfolio.portfolio.PortfolioItem;

import java.util.List;

public class PortfolioAdapter extends RecyclerView.Adapter<PortfolioAdapter.PortfolioViewHolder> {

    private List<PortfolioItem> portfolioItems;
    private PortfolioCallBack listener;

    public PortfolioAdapter(List<PortfolioItem> portfolioItems, PortfolioCallBack listener) {
        this.portfolioItems = portfolioItems;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PortfolioAdapter.PortfolioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_portfolio,parent,false);
        return new PortfolioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PortfolioAdapter.PortfolioViewHolder holder, int position) {
        PortfolioItem item = portfolioItems.get(position);
        holder.position.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return portfolioItems.size();
    }

    public class PortfolioViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView label;
        private TextView description;
        private TextView position;

        public PortfolioViewHolder(@NonNull View itemView) {
            super(itemView);
            position = itemView.findViewById(R.id.item_portfolio_text);
            image = itemView.findViewById(R.id.ivPortfolio_details);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onPortfolioItemClick(getAdapterPosition());
                }
            });
        }
    }
}
