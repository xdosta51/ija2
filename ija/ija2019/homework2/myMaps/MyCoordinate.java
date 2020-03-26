package ija.ija2019.homework2.myMaps;

import ija.ija2019.homework2.maps.Coordinate;

import java.util.Objects;

public class MyCoordinate implements Coordinate {
    private int x;
    private int y;

    public MyCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static MyCoordinate create​(int x, int y) {
        if (x >= 0 && y>= 0) {
            return new MyCoordinate(x,y);
        }
        else {
            return null;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean equals(Object s) { 
        MyCoordinate c = (MyCoordinate) s;
        if (this.x == c.x && this.y == c.y)
            return true;
        return false;
    } 

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    
}