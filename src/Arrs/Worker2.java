package Arrs;

public class Worker2 {
    String name;
    public Department2 department;

    public Worker2(String name, Department2 department){
        this.name = name;
        this.department = department;
        department.addColleague(this);
    }

    public void raise(){
        this.department.setBoss(this);
    }

    public String toString(){
        if (department.getBoss().name == this.name){
            return name + " начальник " + this.department + " отдела";
        }
        return name + " работает в отделе " + department +
                ", начальник которого " + department.getBoss().name;
    }
}