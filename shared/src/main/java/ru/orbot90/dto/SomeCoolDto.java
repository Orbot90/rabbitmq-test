package ru.orbot90.dto;

import java.io.Serializable;

/**
 * Created by plevako on 11.03.2016.
 */
public class SomeCoolDto implements Serializable {
    private String coolParam1;
    private String coolParam2;

    public String getCoolParam1() {
        return coolParam1;
    }

    public void setCoolParam1(String coolParam1) {
        this.coolParam1 = coolParam1;
    }

    public String getCoolParam2() {
        return coolParam2;
    }

    public void setCoolParam2(String coolParam2) {
        this.coolParam2 = coolParam2;
    }
}
