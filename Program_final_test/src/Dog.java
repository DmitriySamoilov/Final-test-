
public class Dog extends Pet{
    public static Integer classCounter = 0;

    public Dog(String name, String birthDay, String commands) {
        super(name, birthDay, commands);
        classCounter++;
        this.type = "Dog";
    }
}
