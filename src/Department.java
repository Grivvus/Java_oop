public class Department {
    Worker boss;
    String name;

    public Department(String name){
        this.name = name;
    }

    public void setBoss(Worker boss) {
        this.boss = boss;
    }

    public Worker getBoss() {
        return boss;
    }

    public String toString(){
        return this.name;
    }
}
