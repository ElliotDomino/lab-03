package com.example.listycitylab3;

import java.security.Provider;

public class City {
    private String name;
    private String province;

    City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }
}
