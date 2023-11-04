
public class Cat extends Pet{
    public static Integer classCounter = 0;
    public Cat(String name, String birthDay, String commands) {
        super(name, birthDay, commands);
        classCounter++;
        this.type = "Cat";
    }
}
