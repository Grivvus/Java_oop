package TheOnlyClass;

public class Name {
    String firstName;
    String secondName;
    String fathersName;

    public Name(String firstName){
        this.firstName = firstName;
        this.secondName = "";
        this.fathersName = "";
    }
    public Name(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fathersName = "";
    }
    public Name(String firstName, String secondName, String fathersName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fathersName = fathersName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }
    public String getFathersName() {
        return fathersName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getSecondName() {
        return secondName;
    }

    public String toString()
    {
        return secondName + " " + firstName + " " + fathersName;
    }
}
