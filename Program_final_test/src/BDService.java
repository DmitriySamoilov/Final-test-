public interface BDService {
    //Имитация работы с БАЗОЙ ДАННЫХ

    static AnimalShelter loadFromBD() {
        try {
            AnimalShelter animalShelter = new AnimalShelter();
            AnimalShelter.fillAnimalShelter(animalShelter);
            System.out.println("База данных питомника загружена.");
            return animalShelter;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Не удалось загрузить базу.");
            return new AnimalShelter();
        }
    }

    static void saveToBD(AnimalShelter animalShelter) {
        System.out.println("База данных питомника сохранена.");
    }
}
