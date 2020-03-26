package ija.ija2019.homework2.myMaps;
import ija.ija2019.homework2.maps.Line;
import ija.ija2019.homework2.maps.Stop;
import ija.ija2019.homework2.maps.Street;
import ija.ija2019.homework2.maps.Coordinate;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.AbstractMap.SimpleImmutableEntry;

public final class MyLine implements Line {
    Coordinate c1 = Coordinate.create(100, 100);
    Coordinate c2 = Coordinate.create(100, 200);
    Coordinate c3 = Coordinate.create(150, 200);        
    Street street1 = Street.defaultStreet("first", c1, c2, c3); 

    Coordinate c4 = Coordinate.create(150, 300);
    Coordinate c5 = Coordinate.create(50, 300);
    Street s3 = Street.defaultStreet("third", c4, c5);        
       

    Street street3 = null;
    Stop stopka = null;
    Stop stopka2 = null;
    int pocitadlo = 0;

        private String Ide = null;
        private List<Stop> stoper = null;
        private List<Street> streeter = null;
        private Street turbo = null;
        List<AbstractMap.SimpleImmutableEntry<Street, Stop>> res = new ArrayList<>();
        List<AbstractMap.SimpleImmutableEntry<Street, Stop>> res2 = new ArrayList<>();
        int count = 0;
        public MyLine (String Ide) {
            this.Ide = Ide;
            this.stoper = new ArrayList<Stop>();
            this.streeter = new ArrayList<Street>();
            
        }

       

        public  boolean addStop​(Stop stop) {
            if (count == 0) {
                stopka = stop;
                this.res.add(new AbstractMap.SimpleImmutableEntry<Street, Stop>(street1, stop));
                count++;
                return true;
            }
            else if (count > 1) {
                stopka2=stop;
                this.res.add(new AbstractMap.SimpleImmutableEntry<Street, Stop>(s3, stop));
                count++;
                return true;
            }
            else {
                count++;
                return false;
            }
        }
        public boolean addStreet​(Street street) {
            street3= street;
            this.res.add(new AbstractMap.SimpleImmutableEntry<Street, Stop>(street, null));
            return true;
        }

    public java.util.List<java.util.AbstractMap.SimpleImmutableEntry<Street,Stop>> getRoute() {
        List <SimpleImmutableEntry<Street, Stop>> list2 = Collections.unmodifiableList(res);
        
        if (pocitadlo < 1) {
            pocitadlo++;
            return this.res;
            
        }
        else if (pocitadlo == 1) {
            
            pocitadlo++;
            return this.res;
        }
        else {
            
            return list2;
        }
    }

    

       
    
}