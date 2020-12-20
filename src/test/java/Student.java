public class Student {
    String name;
    String lastName;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFullName(){
        return (this.name + " " + this.lastName);
    }

    public static int mathSum(int x, int y){
        return x + y;
    }


}
