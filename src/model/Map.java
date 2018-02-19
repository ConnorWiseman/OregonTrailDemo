package model;

import java.util.ArrayList;

public class Map {
    private String currentLocation;
    ArrayList<Location> mapContents;

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public double getMilepost() {
        return milepost;
    }

    public void setMilepost(double milepost) {
        this.milepost = milepost;
    }

    public ArrayList<Location> getMapContents() {
        return mapContents;
    }

    public void setMapContents(ArrayList<Location> mapContents) {
        this.mapContents = mapContents;
    }
    double milepost;
}
