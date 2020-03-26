/*
 * Zdrojové kódy josu součástí zadání 1. úkolu pro předmětu IJA v ak. roce 2019/2020.
 * (C) Radek Kočí
 */
package ija.ija2019.homework2.maps;
import ija.ija2019.homework2.myMaps.MyCoordinate;
/**
 * Reprezentuje pozici (souřadnice) v mapě. Souřadnice je dvojice (x,y), počátek mapy je vždy na pozici (0,0). 
 * Nelze mít pozici se zápornou souřadnicí.
 * @author koci
 */
public interface Coordinate {
    public static Coordinate create​(int x, int y) {
        return new MyCoordinate(x,y);
    }
    /**
     * Vrací hodnotu souřadnice x.
     * @return Souřadnice x.
     */
    public int getX();
    
    /**
     * Vrací hodnotu souřadnice y.
     * @return Souřadnice y.
     */
    public int getY();
    
}

