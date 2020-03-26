package ija.ija2019.homework2.maps;


import ija.ija2019.homework2.maps.Stop;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import ija.ija2019.homework2.myMaps.MyLine;

public interface Line {
    

  

  public static Line defaultLine​(java.lang.String id) {
    return new MyLine(id);
  }

  boolean addStop​(Stop stop);

  java.util.List<java.util.AbstractMap.SimpleImmutableEntry<Street,Stop>> getRoute();

  boolean addStreet​(Street street);



}