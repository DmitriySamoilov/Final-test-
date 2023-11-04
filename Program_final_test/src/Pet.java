
abstract class Pet extends Animal {
    static protected Integer typeCount = 0;
    protected Pet(String name, String birthDay, String commands) {
        super(name,birthDay,commands);
        typeCount++;
    }
}
