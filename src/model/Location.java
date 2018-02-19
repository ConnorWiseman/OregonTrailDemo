package model;

import java.util.ArrayList;

public class Location {
    String name;
    String description;
    
    ArrayList<Scene> scenes;
    
    // LocationType type;
}

// Define the distinction between Location, Scene, and Stop

// Location: a place in three-dimensional space that you can visit
//    - has a milepost measuring distance traveled
// Scene:    a thing that happens when you stop at a Location
//    - landmarks (independence rock, salt lake city, winter quarters)
//    - general store
//        - buy supplies
//    - rivercrossing
//    - fort
//    - hotel
//        - add characters
//    - town
//    - hunt/gather