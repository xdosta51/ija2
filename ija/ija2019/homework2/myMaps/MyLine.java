package ija.ija2019.homework2.myMaps;
import ija.ija2019.homework2.maps.Line;
import ija.ija2019.homework2.maps.Stop;
import ija.ija2019.homework2.maps.Street;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class MyLine implements Line {
        private String Ide = null;
        private List<Stop> stoper = null;
        int count = 0;
        public MyLine (String Ide) {
            this.Ide = Ide;
            this.stoper = new ArrayList<Stop>();

        }

       

        public  boolean addStop​(Stop stop) {
            if (count == 0) {
                this.stoper.add(stop);
                count++;
                return true;
                
            }
                return false;
        
    }

    public java.util.List<java.util.AbstractMap.SimpleImmutableEntry<Street,Stop>> getRoute() {
        return null;
    }
       
    public boolean addStreet​(Street street) {
        return true;
    }
}