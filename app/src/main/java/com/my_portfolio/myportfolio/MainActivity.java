package com.my_portfolio.myportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.my_portfolio.myportfolio.adapter.MenuAdapter;
import com.my_portfolio.myportfolio.cv.CvFragment;
import com.my_portfolio.myportfolio.home.HomeFragment;
import com.my_portfolio.myportfolio.menu.CallBack;
import com.my_portfolio.myportfolio.menu.MenuItem;
import com.my_portfolio.myportfolio.menu.MenuUtils;
import com.my_portfolio.myportfolio.portfolio.PortfolioFragment;
import com.my_portfolio.myportfolio.team.TeamFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity implements CallBack {

    private RecyclerView rvMenu;
    private MenuAdapter menuAdapter;
    private List<MenuItem> menuItems;
    private int selectedMenuPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        setSideMenu();

        setHomeFragment();

    }

    private void setSideMenu() {

        rvMenu = findViewById(R.id.rvMenu);
        menuItems = MenuUtils.getMenuList();
        menuAdapter = new MenuAdapter(menuItems,this);
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        rvMenu.setAdapter(menuAdapter);

    }

    private void setPortfolioFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new PortfolioFragment()).commit();
    }

    private void setTeamFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new TeamFragment()).commit();
    }

    private void setCvFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new CvFragment()).commit();
    }

    private void setHomeFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
    }

    @Override
    public void onSideMenuItemClick(int position) {
        switch (menuItems.get(position).getCode()) {
            case MenuUtils.HOME_FRAGMENT_CODE:
                setHomeFragment();
                break;
            case MenuUtils.CV_FRAGMENT_CODE:
                setCvFragment();
                break;
            case MenuUtils.TEAM_FRAGMENT_CODE:
                setTeamFragment();
                break;
            case MenuUtils.PORTFOLIO_FRAGMENT_CODE:
                setPortfolioFragment();
                break;
            default: setHomeFragment();
        }

        menuItems.get(selectedMenuPosition).setSelected(false);
        menuItems.get(position).setSelected(true);
        selectedMenuPosition = position;
        menuAdapter.notifyDataSetChanged();
    }
}