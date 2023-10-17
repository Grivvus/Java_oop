package Chapter1;

public class Human {
    public String name;
    public int height;

    public String toString(){
        return "Человек с именем " + '"' + name + '"' + " и ростом " + height;
    }
}
//import Chapter1.Exc_112;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//        Human Cleo = new Human();
//        Cleo.height = 152;
//        Cleo.name = "Cleopatra";
//        Human Pushkin = new Human();
//        Pushkin.height = 167;
//        Pushkin.name = "Alexandr";
//        Human Volodya = new Human();
//        Volodya.height = 189;
//        Volodya.name = "Vladimir";
//        System.out.println(Cleo);
//        System.out.println(Pushkin);
//        System.out.println(Volodya);
//    }
//}