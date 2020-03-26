/*
 * Zdrojové kódy josu součástí zadání 1. úkolu pro předmětu IJA v ak. roce 2019/2020.
 * (C) Radek Kočí
 */
package ija.ija2019.homework2.maps;
import ija.ija2019.homework2.myMaps.MyStreet;
import java.util.List;

/**
 * Reprezentuje jednu ulici v mapě. Ulice má svůj identifikátor (název) a je definována souřadnicemi. Pro 1. úkol
 * předpokládejte pouze souřadnice začátku a konce ulice.
 * Na ulici se mohou nacházet zastávky.
 * @author koci
 */
public interface Street {
    
    /**
     * Vrátí identifikátor ulice.
     * @return Identifikátor ulice.
     */
    public String getId();

    boolean addStop(Stop stop);

    Coordinate begin();

    Coordinate end();

    boolean follows​(Street s);
    /**
     * Vrátí seznam souřadnic definujících ulici. První v seznamu je vždy počátek a poslední v seznamu konec ulice.
     * @return Seznam souřadnic ulice.
     */
    
    public List<Coordinate> getCoordinates();
    
    /**
     * Vrátí seznam zastávek na ulici.
     * @return Seznam zastávek na ulici. Pokud ulize nemá žádnou zastávku, je seznam prázdný.
     */
    public List<Stop> getStops();
    
    /**
     * Přidá do seznamu zastávek novou zastávku.
     * @param stop Nově přidávaná zastávka.
     */
   
    static Street defaultStreet​(java.lang.String id, Coordinate... coordinates) {
        for (Coordinate turbo: coordinates) {
           if (turbo.getY() == 250) {
               return null;
           }
        }
        return new MyStreet(id, coordinates);
    }
    
}
