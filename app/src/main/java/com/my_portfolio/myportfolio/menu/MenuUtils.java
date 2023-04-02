package com.my_portfolio.myportfolio.menu;

import com.my_portfolio.myportfolio.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtils {

    public static final int HOME_FRAGMENT_CODE = 0;
    public static final int CV_FRAGMENT_CODE = 1;
    public static final int PORTFOLIO_FRAGMENT_CODE = 2;
    public static final int TEAM_FRAGMENT_CODE = 3;

    public static List<MenuItem> getMenuList() {
        List<MenuItem> list = new ArrayList<>();

        list.add(new MenuItem(R.drawable.ic_home,HOME_FRAGMENT_CODE,true));
        list.add(new MenuItem(R.drawable.school,CV_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_group,TEAM_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_baseline_dashboard_24,PORTFOLIO_FRAGMENT_CODE,false));

        return list;
    }

}
