package human;

public class Female extends Person implements FemaleInterface{
    Female() {
        this("Her name", 0);
    }
    
    Female(String userName, int age) {
        //PEOPLECOUNTER += 1;
        this.name = userName;
        this.gender = "Female";
        this.setAge(age);
        this.health=100;
    }

    @Override
    public void giveBirth() {
    }
}