package com.company;

public class Guitar {
    private String make;
    private String model;
    private int strings;
    private boolean electric;

    public Guitar() {
}

    public Guitar(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Guitar(String make, String model, int strings, boolean electric) {
    this.make = make;
    this.model = model;
    this.strings = strings;
    this.electric = electric;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}



