
abstract class PackAnimal extends Animal{
    static protected Integer typeCount = 0;
    protected PackAnimal(String name, String birthDay, String commands) {
        super(name,birthDay,commands);
        typeCount++;
    }
}
