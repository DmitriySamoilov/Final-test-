
public class Camel extends PackAnimal{
    public static Integer classCounter = 0;
    public Camel(String name, String birthDay, String commands) {
        super(name, birthDay, commands);
        classCounter++;
        this.type = "Camel";
    }
}
