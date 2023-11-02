import Arrs.Department2;
import Arrs.Worker2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

//        // 1.1.1
//        TheOnlyClass.Point p = new TheOnlyClass.Point(1, 2);
//        System.out.println(p);
//
//        // 1.1.2
//        TheOnlyClass.Human Cleo = new TheOnlyClass.Human("Cleopatra", 152);
//        TheOnlyClass.Human Pushkin = new TheOnlyClass.Human("Alexandr", 167);
//        TheOnlyClass.Human Volodya = new TheOnlyClass.Human("Vladimir", 189);
//        System.out.println(Cleo);
//        System.out.println(Pushkin);
//        System.out.println(Volodya);
//
//        // 1.1.3
//        TheOnlyClass.Name A = new TheOnlyClass.Name("Cleopatre");
//        System.out.println(A);
//        TheOnlyClass.Name B = new TheOnlyClass.Name("Alexandr", "Pushkin", "Sergeevich");
//        System.out.println(B);
//        TheOnlyClass.Name C = new TheOnlyClass.Name("Vladimir", "Mayakovskii");
//        System.out.println(C);
//
//        // 1.1.4
//        TheOnlyClass.Time t1 = new TheOnlyClass.Time(10);
//        TheOnlyClass.Time t2 = new TheOnlyClass.Time(10000);
//        TheOnlyClass.Time t3 = new TheOnlyClass.Time(100000);
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println(t3);
//
//        // 1.1.5
//        TheOnlyClass.House d1 = new TheOnlyClass.House(1);
//        System.out.println(d1);
//        TheOnlyClass.House d2 = new TheOnlyClass.House(5);
//        System.out.println(d2);
//        TheOnlyClass.House d3 = new TheOnlyClass.House(23);
//        System.out.println(d3);
//
        // 1.2.1
//        TheOnlyClass.Point start1 = new TheOnlyClass.Point(1, 3);
//        TheOnlyClass.Point end1 = new TheOnlyClass.Point(23, 8);
//        SomeClasses.Line l1 = new SomeClasses.Line(start1, end1);
//        System.out.println(l1);
//
//        TheOnlyClass.Point start2 = new TheOnlyClass.Point(5, 10);
//        TheOnlyClass.Point end2 = new TheOnlyClass.Point(25, 10);
//        SomeClasses.Line l2 = new SomeClasses.Line(start2, end2);
//        System.out.println(l2);
//
//        SomeClasses.Line l3 = new SomeClasses.Line(start1, end2);
//        System.out.println(l3);
//
//        l1.setStart(new TheOnlyClass.Point(1, 5));
//        l2.setEnd(new TheOnlyClass.Point(24, 9));
//
//        l1.setEnd(new TheOnlyClass.Point(7, 7));
//        l2.setStart(new TheOnlyClass.Point(1, 1));
//
//        // 1.2.2
//        HumanWithName h1 = new HumanWithName(A, 152);
//        System.out.println(h1);
//
//        HumanWithName h2 = new HumanWithName(B, 167);
//        System.out.println(h2);
//
//        HumanWithName h3 = new HumanWithName(C, 189);
//        System.out.println(h3);

        // 1.2.3
//        TheOnlyClass.Name I = new TheOnlyClass.Name("Ivan", "Chudov");
//        TheOnlyClass.Name P = new TheOnlyClass.Name("Petr", "Chudov");
//        TheOnlyClass.Name Bo = new TheOnlyClass.Name("Boris");
//        TheOnlyClass.Human Ivan = new TheOnlyClass.Human(I, 179);
//        TheOnlyClass.Human Petr = new TheOnlyClass.Human(P, 182, Ivan);
//        TheOnlyClass.Human Boris = new TheOnlyClass.Human(Bo, 175, Petr);
//        System.out.println(Ivan);
//        System.out.println(Petr);
//        System.out.println(Boris);

        // 1.2.4
//        SomeClasses.Department IT = new SomeClasses.Department("IT");
//        SomeClasses.Worker Petrov = new SomeClasses.Worker("Petrov", IT);
//        SomeClasses.Worker Kozlov = new SomeClasses.Worker("Kozlov", IT);
//        SomeClasses.Worker Sidorov = new SomeClasses.Worker("Sidorov", IT);
//        Kozlov.raise();
//        System.out.println(Petrov);
//        System.out.println(Kozlov);
//        System.out.println(Sidorov);

        // 1.3.1
//        Integer[] grades = {4, 5, 5, 3, 4, 4};
//        Arrays.Student Vasya = new Arrays.Student("Vasya", grades);
//        Arrays.Student Petia = new Arrays.Student("Petia", Vasya.grades);
//        Arrays.Student Andrew = new Arrays.Student("Andrew", Vasya.grades.clone());
//        Vasya.grades[0] = 5;
//        System.out.println(Vasya);
//        System.out.println(Petia);
//        System.out.println(Andrew);

        // 1.3.2
//        TheOnlyClass.Point p1 = new TheOnlyClass.Point(1, 5);
//        TheOnlyClass.Point p2 = new TheOnlyClass.Point(2, 8);
//        TheOnlyClass.Point p3 = new TheOnlyClass.Point(5, 3);
//        TheOnlyClass.Point p4 = new TheOnlyClass.Point(2, -5);
//        TheOnlyClass.Point p5 = new TheOnlyClass.Point(4, -8);
//        TheOnlyClass.Point[] p_l1 = {p1, p2, p3};
//        TheOnlyClass.Point[] p_l2 = {p1, p4, p5, p3};
//
//        Arrays.BrokenLine l1 = new Arrays.BrokenLine(p_l1);
//        Arrays.BrokenLine l2 = new Arrays.BrokenLine(p_l2);
//        System.out.println(l1);
//        System.out.println(l2);
//        l1.getPoints()[0].setX(2);
//        l1.getPoints()[0].setY(3);

        // 1.3.3
//        Road AF = new Road("F", 1);
//        Road AB = new Road("B", 5);
//        Road AD = new Road("D", 6);
//        Road FB = new Road("B", 1);
//        Road FE = new Road("E", 2);
//        Road BA = new Road("A", 5);
//        Road BC = new Road("C", 3);
//        Road CB = new Road("B", 3);
//        Road CD = new Road("D", 4);
//        Road DE = new Road("E", 2);
//        Road DA = new Road("A", 6);
//        Road EF = new Road("F", 2);
//
//        City A = new City("A");
//        A.addRoad(AF);
//        A.addRoad(AB);
//        A.addRoad(AD);
//
//        City B = new City("B");
//        B.addRoad(BA);
//        B.addRoad(BC);
//
//        City C = new City("C");
//        C.addRoad(CB);
//        C.addRoad(CD);
//
//        City D = new City("D");
//        D.addRoad(DE);
//        D.addRoad(DA);
//
//        City E = new City("E");
//        E.addRoad(EF);
//
//        City F = new City("F");
//        F.addRoad(FB);
//        F.addRoad(FE);
//
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);
//        System.out.println(D);
//        System.out.println(E);
//        System.out.println(F);

        // 1.3.4
//        Department2 it = new Department2("IT");
//        Worker2 w1 = new Worker2("Volodya", it);
//        Worker2 w2 = new Worker2("Vasya", it);
//        Worker2 w3 = new Worker2("Sanya", it);
//        w3.raise();
//        w1.department.ret_colleagues();

    }
}