package com.my_portfolio.myportfolio.portfolio;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;

public class PortfolioItem implements Serializable {

    private int img;
    private String label;
    private String infoPortfolio;

    public PortfolioItem(int img, String label, String infoPortfolio) {
        this.img = img;
        this.label = label;
        this.infoPortfolio = infoPortfolio;
    }

    public PortfolioItem() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getInfoPortfolio() {
        return infoPortfolio;
    }

    public void setInfoPortfolio(String infoPortfolio) {
        this.infoPortfolio = infoPortfolio;
    }
}
