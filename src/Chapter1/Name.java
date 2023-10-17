package Chapter1;

public class Name {
    public String firstName = "";
    public String secondName = "";
    public String fathersName = "";

    public String toString(){
        return secondName  + " " + firstName + " " + fathersName;
    }

}

//import Chapter1.Name;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//        Name A = new Name();
//        A.firstName = "Cleopatra";
//        Name B = new Name();
//        B.fathersName = "Sergeevich";
//        B.firstName = "Alexandr";
//        B.secondName = "Pushkin";
//        Name C = new Name();
//        C.firstName = "Vladimir";
//        C.secondName = "Mayakovskii";
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);
//    }
//}