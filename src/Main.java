public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

//        // 1.1.1
//        Point p = new Point(1, 2);
//        System.out.println(p);
//
//        // 1.1.2
//        Human Cleo = new Human("Cleopatra", 152);
//        Human Pushkin = new Human("Alexandr", 167);
//        Human Volodya = new Human("Vladimir", 189);
//        System.out.println(Cleo);
//        System.out.println(Pushkin);
//        System.out.println(Volodya);
//
//        // 1.1.3
//        Name A = new Name("Cleopatre");
//        System.out.println(A);
//        Name B = new Name("Alexandr", "Pushkin", "Sergeevich");
//        System.out.println(B);
//        Name C = new Name("Vladimir", "Mayakovskii");
//        System.out.println(C);
//
//        // 1.1.4
//        Time t1 = new Time(10);
//        Time t2 = new Time(10000);
//        Time t3 = new Time(100000);
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println(t3);
//
//        // 1.1.5
//        House d1 = new House(1);
//        System.out.println(d1);
//        House d2 = new House(5);
//        System.out.println(d2);
//        House d3 = new House(23);
//        System.out.println(d3);
//
//        // 1.2.1
//        Point start1 = new Point(1, 3);
//        Point end1 = new Point(23, 8);
//        Line l1 = new Line(start1, end1);
//        System.out.println(l1);
//
//        Point start2 = new Point(5, 10);
//        Point end2 = new Point(25, 10);
//        Line l2 = new Line(start2, end2);
//        System.out.println(l2);
//
//        Line l3 = new Line(start1, end2);
//        System.out.println(l3);
//
//        l1.setStart(new Point(1, 5));
//        l2.setEnd(new Point(24, 9));
//
//        l1.setEnd(new Point(7, 7));
//        l2.setStart(new Point(1, 1));
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
//        Name I = new Name("Ivan", "Chudov");
//        Name P = new Name("Petr", "Chudov");
//        Name Bo = new Name("Boris");
//        Human Ivan = new Human(I, 179);
//        Human Petr = new Human(P, 182, Ivan);
//        Human Boris = new Human(Bo, 175, Petr);
//        System.out.println(Ivan);
//        System.out.println(Petr);
//        System.out.println(Boris);

        // 1.2.4
        Department IT = new Department("IT");
        Worker Petrov = new Worker("Petrov", IT);
        Worker Kozlov = new Worker("Kozlov", IT);
        Worker Sidorov = new Worker("Sidorov", IT);
        Kozlov.raise();
        System.out.println(Petrov);
        System.out.println(Kozlov);
        System.out.println(Sidorov);
    }
}