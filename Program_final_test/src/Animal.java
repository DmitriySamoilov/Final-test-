
abstract class Animal {
    static protected Integer animalCount = 0;
    protected String id;
    protected String type;
    protected String name;
    protected String birthDay;
    protected String commands;

    protected Animal(String name, String birthDay,String commands ) {
        animalCount ++;
        this.id = animalCount.toString();
        this.name = name;
        this.birthDay = birthDay;
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "id " + id + "\t" + type + "\t\t" + name + "\t" +  birthDay;
    }
}
