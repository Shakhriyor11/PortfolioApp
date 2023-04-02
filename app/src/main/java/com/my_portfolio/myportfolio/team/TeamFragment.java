package com.my_portfolio.myportfolio.team;

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
import com.my_portfolio.myportfolio.adapter.TeamAdapter;

import java.util.ArrayList;
import java.util.List;

public class TeamFragment extends Fragment {

    private RecyclerView rvTeam;
    private TeamAdapter adapter;
    private List<TeamItem> teamMembers;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvTeam = view.findViewById(R.id.rvOurTeam);

        teamMembers = new ArrayList<>();
        teamMembers.add(new TeamItem(R.drawable.user,"John Doe",getString(R.string.lorem_text_2)));
        teamMembers.add(new TeamItem(R.drawable.user,"Mark Skorfild",getString(R.string.lorem_text_1)));
        teamMembers.add(new TeamItem(R.drawable.user,"Jim MacCoul",getString(R.string.lorem_text_2)));
        teamMembers.add(new TeamItem(R.drawable.user,"Adam Murphy",getString(R.string.lorem_text_1)));
        teamMembers.add(new TeamItem(R.drawable.user,"Ahmed Ali",getString(R.string.lorem_text_1)));


        rvTeam.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TeamAdapter(teamMembers);
        rvTeam.setAdapter(adapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_team, container, false);
    }
}