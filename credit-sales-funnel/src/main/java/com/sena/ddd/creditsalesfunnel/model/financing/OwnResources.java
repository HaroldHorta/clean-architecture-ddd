package com.sena.ddd.creditsalesfunnel.model.financing;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OwnResources implements Serializable {

    private int liquidAssets;
    private int balanceFromBuildingSociety;
    private int ownManpower;

    public int getBalanceFromBuildingSociety() {
        return balanceFromBuildingSociety;
    }

    public void setBalanceFromBuildingSociety(int balanceFromBuildingSociety) {
        this.balanceFromBuildingSociety = balanceFromBuildingSociety;
    }

    public int getOwnManpower() {
        return ownManpower;
    }

    public void setOwnManpower(int ownManpower) {
        this.ownManpower = ownManpower;
    }

    public int getLiquidAssets() {
        return liquidAssets;
    }

    public void setLiquidAssets(int liquidAssets) {
        this.liquidAssets = liquidAssets;
    }
}
