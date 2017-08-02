package human;
public class Human {

    public static void main(String[] args) {
            
        //Object instantiation
        Person person1 = new Person();
        person1.printStates(); //Calling Object methods
        
        Person person2 = new Male("Mike", 30);
        person2.printStates();
        
        Person person3 = new Female("Toyin", 40);
        person3.printStates();
        
        System.out.println("Number of People Created: "+ Person.getNumPeople());
    }
}
