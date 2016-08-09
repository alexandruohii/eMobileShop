package com.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Alx on 8/9/2016.
 */
@Entity
@DiscriminatorValue("Games")
public class Game extends Product {



    @Column(name = "gamedevice")
    private String gameDevice;

    @Column(name = "gametype")
    private String gameType;

    public String getGameDevice() {
        return gameDevice;
    }

    public void setGameDevice(String gameDevice) {
        this.gameDevice = gameDevice;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
