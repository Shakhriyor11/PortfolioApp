package com.my_portfolio.myportfolio.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my_portfolio.myportfolio.R;
import com.my_portfolio.myportfolio.menu.CallBack;
import com.my_portfolio.myportfolio.menu.MenuItem;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private List<MenuItem> menuItemList;
    private CallBack listener;

    public MenuAdapter(List<MenuItem> menuItemList, CallBack listener) {
        this.menuItemList = menuItemList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MenuViewHolder holder, int position) {
        MenuItem item = (MenuItem) menuItemList.get(position);
        holder.icon.setImageResource(item.getIcon());
        if (item.isSelected()) {
            holder.isSelected.setVisibility(View.VISIBLE);
        } else {
            holder.isSelected.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return menuItemList.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {

        private ImageView icon;
        private ImageView isSelected;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.item_menu_icon);
            isSelected = itemView.findViewById(R.id.item_menu_selected);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onSideMenuItemClick(getAdapterPosition());
                }
            });
        }
    }
}
