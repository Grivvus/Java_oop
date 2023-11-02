package Arrs;

import java.util.Arrays;

public class Student {
    private String name;
    Integer[] grades;

    public Student(String n){
        this.name = n;
    }

    public Student(String n, Integer[] g){
        this.name = n;
        this.grades = g;
    }

    public String toString(){
        return this.name + ":" + Arrays.toString(this.grades);
    }

}
