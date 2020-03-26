package ija.ija2019.homework2.myMaps;
import ija.ija2019.homework2.maps.Street;
import ija.ija2019.homework2.maps.Stop;
import ija.ija2019.homework2.maps.Coordinate;
import java.util.Objects;

public class MyStop implements Stop {
    private String getIde;
    private Coordinate c1;
    private Street s1;
    int count = 0;
    public MyStop(String getIde,  Coordinate c1) {
        this.getIde = getIde;
        this.c1 = c1;
    }

    public boolean equals(Object s) { 
        MyStop c = (MyStop) s;
        int pes =  this.getId().compareTo(c.getIde); 
        if (pes == 0)
            return true;
        return false;
    } 

    @Override
    public int hashCode() {
        return Objects.hash(getIde, c1, s1);
    }
    
    public MyStop(String getIde) {
        this.getIde = getIde;
    }     

    public String getId() {
        if (this.getIde != null)
            return this.getIde;
        else 
            return null;
    }

    public Coordinate getCoordinate() {
        if (this.c1 != null) 
            return this.c1;
        else 
            return null;
    }

    public void setStreet(Street s) {
        this.s1 = s;
        return;
    }
    
    public Street getStreet() {
        if (this.s1 != null)
            return this.s1;
        else 
            return null;
    }

    public String toString() {
        String pes = "stop" + "(" + this.getIde + ")";
        return pes;
    }
     
}