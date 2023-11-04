
public class Main {

    public static void main(String[] args) {
        AnimalShelter animalShelter = BDService.loadFromBD();
        Menu menu = new Menu();
        menu.start(animalShelter);
    }
}