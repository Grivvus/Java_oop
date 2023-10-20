public class Worker {
    String name;
    Department department;

    public Worker(String name, Department department){
        this.name = name;
        this.department = department;
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
