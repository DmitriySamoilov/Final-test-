

public class Horse extends PackAnimal{
    public static Integer classCounter = 0;
    public Horse(String name, String birthDay, String commands) {
        super(name, birthDay, commands);
        classCounter++;
        this.type = "Horse";
    }
}
