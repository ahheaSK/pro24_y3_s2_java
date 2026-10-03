package classes;

public class Dog {


    // Data Member
    // Syntax
    // 1 Access Modify, 2 Data Type, 3 Property Name, 4 Default value
//    public String name = "Tommy";
//    public String color = "White";
//    public int age = 2;

    public String name;
    public String color;
    public int age;
    //public final double PI = 3.14;

    //Constructor
//    public Dog() {
//        System.out.println("Constructor");
//    }
    public Dog() {
        this.name = name;
        System.out.println("Constructor");
        System.out.println("Name: " + this.name);

    }

    // 1 ACC Modify, 2 Return Type,3 Method Name, 4 Parameter List
    // Return Type
    public String getName () {
        return name;
    }

    // None Return Type
    public void setName (String newName) {
        name = newName;
    }

    public void bark() {
        System.out.println("Wofe Wofe Wofe");
    }



}
