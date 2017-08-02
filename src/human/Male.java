package human;

public class Male extends Person implements MaleInterface {

    Male() {
        this("His name", 6);
    }

    Male(String userName, int age) {
        //PEOPLECOUNTER += 1;
        this.name = userName;
        this.gender = "Male";
        this.setAge(age);
        this.health =100;
    }

    @Override
    public void pissStanding() {
    }
}
