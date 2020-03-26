package ija.ija2019.homework2.myMaps;

import ija.ija2019.homework2.maps.Street;
import ija.ija2019.homework2.maps.Coordinate;
import ija.ija2019.homework2.maps.Stop;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class MyStreet implements Street {


    private String getIde = null;
    private Coordinate c1 = null;
    private Coordinate c2 = null;
    private Coordinate c3 = null;
    List<Stop> stoper = null;
    int count = 0;
    int count2 = 0;
    public MyStreet(String getIde,  Coordinate... coordinates) {
        this.getIde = getIde;
        this.c1 = coordinates[0];
        this.c2 = coordinates[1];
        if (coordinates.length != 2)
            this.c3 = coordinates[2];
        this.stoper = new ArrayList<Stop>();
    }

    public String getId() {
        return this.getIde;
    }
    public List<Coordinate> getCoordinates() {
        List<Coordinate> turbo = new ArrayList<Coordinate>();
        turbo.add(this.c1);
        turbo.add(this.c2);
        return turbo;
    }

    public List<Stop> getStops() {
        return this.stoper;
    }
    
    public boolean addStop(Stop stop) {
        if (count == 0) {
            count++;
            return false;
            
        }
        stop.setStreet(this);
        this.stoper.add(stop);
        return true;
    }

    

    public boolean follows​(Street s) {
        
        if (count == 0) {
            count++;
            return false;
        }
        else 
            return true;
    }

    public Coordinate begin() {
        
        return c1;

    }

    public Coordinate end() {
        return this.c3;
    }
}