package Arrs;


import java.util.ArrayList;
import java.util.List;

public class City {
    String name;
    List<Road> roads = new ArrayList<Road>();

    public City(String n, List<Road> r){
        this.name = n;
        this.roads = r;
    }

    public City(String n){
        this.name = n;
    }


    public void addRoad(Road r){
        this.roads.add(r);
    }

    public String toString(){
        String x = "";
        for (Road i: roads){
            x = x + i.city_name + ": " + i.cost + "\n";
        }
        return "City " + this.name + " has roads"  + "\n" + x;
    }


}
