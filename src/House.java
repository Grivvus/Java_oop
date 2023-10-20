public class House {
    int floors;

    public House(int n){
        this.floors = n;
    }

    private String convertTostr(){
        if (this.floors%10==1 && this.floors != 11){
            return " этажом";
        }
        else{
            return " этажами";
        }
    }

    public String toString(){
        return "Дом с " + this.floors + convertTostr();
    }
}
