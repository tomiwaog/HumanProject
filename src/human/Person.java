package human;

public class Person {
 
    //Encapsulation - OOP using access modifiers 
    protected String name, wellbeing, gender; //Class, Package, subclass access
    private int age, id; //accessible via methods 
    int health; //Package only access
    private static int PEOPLECOUNTER = 0; //Static variable

    //Deault unparameterised constructor
    Person() {
        this("UnNamed", "UNSET", 0); //this - explicit constructor invocation
    }

    //Use of polymorphism - Overloading Constructors
    Person(String userName, String gender, int age) {
        id = ++PEOPLECOUNTER;
        this.name = userName;
        this.gender = gender;
        this.age = age;
        this.health=100;
    }

    //setters methods
    void changeName(String newName) {
        name = newName;
    }
    
    //Getters methods
    public int getId(){
        return id;
    }

    void printStates() {
        System.out.println("ID: " + getId() + "\tName: " + name
                + "\tage: " + age + "\tGender: " + gender
                + "\tCurrent feeling: " + getWellBeing());
    }

    int getHealth() {
        return health;
    }

    String getWellBeing() {
        wellbeing = health < 50 ? ":(" : ":)"; //tenary operators
        return wellbeing;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    //Static methods returning static field
    public static int getNumPeople() {
        return PEOPLECOUNTER;
    }
}