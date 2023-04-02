package com.my_portfolio.myportfolio.portfolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my_portfolio.myportfolio.R;
import com.my_portfolio.myportfolio.adapter.PortfolioAdapter;

import java.util.ArrayList;
import java.util.List;

public class PortfolioFragment extends Fragment implements PortfolioCallBack {

    private RecyclerView rvPortfolio;
    private PortfolioAdapter portfolioAdapter;
    private List<PortfolioItem> portfolioItems;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvPortfolio = view.findViewById(R.id.rvPortfolio);
        portfolioItems = new ArrayList<>();
        portfolioItems.add(new PortfolioItem());
        portfolioItems.add(new PortfolioItem());
        portfolioItems.add(new PortfolioItem());
        portfolioItems.add(new PortfolioItem());
        portfolioItems.add(new PortfolioItem());
        portfolioItems.add(new PortfolioItem());
        portfolioItems.add(new PortfolioItem());
        portfolioItems.add(new PortfolioItem());
        portfolioItems.add(new PortfolioItem());
        portfolioAdapter = new PortfolioAdapter(portfolioItems, this);
        rvPortfolio.setLayoutManager(new GridLayoutManager(getActivity(),3));
        rvPortfolio.setAdapter(portfolioAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }

    @Override
    public void onPortfolioItemClick(int position) {
        PortfolioDetailFragment portfolioDetailFragment = new PortfolioDetailFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable("object",portfolioItems.get(position));
        portfolioDetailFragment.setArguments(bundle);

        portfolioDetailFragment.show(getActivity().getSupportFragmentManager(),"tagname");
    }
}