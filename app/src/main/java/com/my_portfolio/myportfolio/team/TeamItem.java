package com.my_portfolio.myportfolio.team;

import android.widget.ImageView;

public class TeamItem {

    private int userImage;
    private String name;
    private String description;

    public TeamItem(int userImage, String name, String description) {
        this.userImage = userImage;
        this.name = name;
        this.description = description;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
