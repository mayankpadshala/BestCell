package com.example.android.bestcell.models;

import org.parceler.Parcel;

@Parcel
public class Model {

    private String name;

    public Model() {
    }

    public Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}