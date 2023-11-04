
public class Hamster extends Pet {
    public static Integer classCounter = 0;
    public Hamster(String name, String birthDay, String commands) {
        super(name, birthDay, commands);
        classCounter++;
        this.type = "Hamster";
    }
}
