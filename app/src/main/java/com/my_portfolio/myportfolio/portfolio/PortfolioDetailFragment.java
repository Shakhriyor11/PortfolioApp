package com.my_portfolio.myportfolio.portfolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.my_portfolio.myportfolio.R;

public class PortfolioDetailFragment extends BottomSheetDialogFragment {

    private ImageView img;
    private TextView tvTitle;
    private TextView tvDescription;

    public PortfolioDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        img = view.findViewById(R.id.ivPortfolio_details);
        tvTitle = view.findViewById(R.id.tvProject_name);
        tvDescription = view.findViewById(R.id.tvProject_detail);
    }

    void loadPortfolioData(PortfolioItem item) {

        Glide.with(getContext()).load(item.getImg()).into(img);
    }
}