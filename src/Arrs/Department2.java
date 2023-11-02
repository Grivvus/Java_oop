package Arrs;

import java.util.ArrayList;
import java.util.List;

public class Department2 {
    Worker2 boss;
    String name;
    List<Worker2> colleagues = new ArrayList<Worker2>();

    public void ret_colleagues(){
        for(Worker2 i: colleagues){
            System.out.println(i.name);
        }
    }

    public Department2(String name){
        this.name = name;
    }

    public void setBoss(Worker2 boss) {
        this.boss = boss;
    }

    public Worker2 getBoss() {
        return boss;
    }

    public void addColleague(Worker2 w){
        this.colleagues.add(w);
    }

    public String toString(){
        return this.name;
    }
}