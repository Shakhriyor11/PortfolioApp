package com.my_portfolio.myportfolio.cv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my_portfolio.myportfolio.R;
import com.my_portfolio.myportfolio.adapter.CvAdapter;

import java.util.ArrayList;
import java.util.List;

public class CvFragment extends Fragment {

    private RecyclerView rvCv;
    private CvAdapter adapter;
    private List<CvItem> itemList;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCv = view.findViewById(R.id.rvCV);

        itemList = new ArrayList<>();
        itemList.add(new CvItem("20 April 2013",getString(R.string.lorem_text_1)));
        itemList.add(new CvItem("25 May 2013",getString(R.string.lorem_text_2)));
        itemList.add(new CvItem("15 June 2013",getString(R.string.lorem_text_1)));
        itemList.add(new CvItem("20 June 2013",getString(R.string.lorem_text_2)));
        itemList.add(new CvItem("5 Jule 2013",getString(R.string.lorem_text_2)));
        itemList.add(new CvItem("18 Jule 2013",getString(R.string.lorem_text_1)));
        itemList.add(new CvItem("30 Jule 2013",getString(R.string.lorem_text_2)));
        itemList.add(new CvItem("12 August 2013",getString(R.string.lorem_text_1)));

        adapter = new CvAdapter(itemList);

        rvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        rvCv.setAdapter(adapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cv, container, false);
        return view;
    }
}