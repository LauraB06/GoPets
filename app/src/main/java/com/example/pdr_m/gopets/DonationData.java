package com.example.pdr_m.gopets;

/**
 * Created by laura on 27-Jun-17.
 */

public class DonationData {
    String name;
    String meta;

    public DonationData(String name, String meta) {
        this.name = name;
        this.meta = meta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }
}
