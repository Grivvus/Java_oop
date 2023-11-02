package TheOnlyClass;

public class Human {
     Name name;

    private int height;
    private Human father;

    public Human(String name, int height) {
        this.name = new Name(name);
        this.height = height;
    }
    public Human(Name name, int height){
        this.name = name;
        this.height = height;
    }

    public Human(String name, int height, Human father){
        this.father = father;
        this.height = height;
        this.name = new Name(name);
    }

    public Human(Name name, int height, Human father){
        this.name = name;
        this.height = height;
        this.father = father;
    }

    private void fixingName(){
        if (this.name.getFathersName() == "" && this.father != null){
            this.name.setFathersName(this.father.name.getFirstName() + "ович");
        }
        if (this.name.getSecondName() == "" && this.father.name.getSecondName() != ""){
            this.name.setSecondName(this.father.name.getSecondName());
        }
    }

    public String toString(){
        this.fixingName();
        return "Человек с именем " + this.name + " и ростом " + this.height;
    }
}


// version1

//public class TheOnlyClass.Human {
//    private String name;
//
//    public int getHeight() {
//        return height;
//    }
//    private int height;
//
//    public TheOnlyClass.Human(String name, int height) {
//        this.name = name;
//        this.height = height;
//
//    }
//
//    public String toString(){
//        return "Человек с именем " + '"' + this.name + '"' + "и ростом " + this.height;
//    }
//}
