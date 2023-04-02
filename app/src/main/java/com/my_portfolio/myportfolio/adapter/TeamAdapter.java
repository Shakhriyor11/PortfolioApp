package com.my_portfolio.myportfolio.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my_portfolio.myportfolio.R;
import com.my_portfolio.myportfolio.team.TeamItem;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    private List<TeamItem> members;

    public TeamAdapter(List<TeamItem> members) {
        this.members = members;
    }

    @NonNull
    @Override
    public TeamAdapter.TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team,parent,false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamAdapter.TeamViewHolder holder, int position) {
        TeamItem item = members.get(position);
        holder.userImage.setImageResource(item.getUserImage());
        holder.userName.setText(item.getName());
        holder.info.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    public class TeamViewHolder extends RecyclerView.ViewHolder {

        private ImageView userImage;
        private TextView userName;
        private TextView info;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.userImage);
            userName = itemView.findViewById(R.id.name);
            info = itemView.findViewById(R.id.info);

        }
    }
}
