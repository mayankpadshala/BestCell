package com.example.android.bestcell.models;

import org.parceler.Parcel;

import java.util.List;

@Parcel
public class Manufacturer {

    private String name;
    private List<Model> models;

    public Manufacturer() {
    }

    public Manufacturer(String name, List<Model> models) {
        this.name = name;
        this.models = models;
    }

    public List<Model> getModels() {
        return models;
    }

    public String getName(){
        return name;
    }

}
