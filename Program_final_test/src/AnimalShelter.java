import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    public List<Animal> animalList;

    public AnimalShelter() {
        this.animalList = new ArrayList<>();
    }

    public void add(Animal animal) {
        this.animalList.add(animal);
    }

    public static void fillAnimalShelter(AnimalShelter animalShelter) {
        animalShelter.add(new Cat("Полли", "1998-12-20", "Замри Прыжок Еда"));
        animalShelter.add(new Cat("Олли", "2000-10-12", "Замри Еда Спать"));
        animalShelter.add(new Dog("Лоли", "1990-01-01", "Место Охраняй Фу Рядом"));
        animalShelter.add(new Dog("Тор", "1999-12-01", "Место Охраняй Фу Рядом Голос"));
        animalShelter.add(new Dog("Пилат", "2023-09-01", "Место Рядом"));
        animalShelter.add(new Donkey("Джек", "2020-01-10","Идём Стоять Сесть"));
        animalShelter.add(new Donkey("Джил", "2020-01-10","Идём Стоять Сесть"));
        animalShelter.add(new Camel("Лилу", "1950-01-01", "Сидеть Пить Есть"));
        animalShelter.add(new Camel("Липа", "1989-06-05", "Сидеть Пить Есть"));
        animalShelter.add(new Horse ("Граф", "2010-07-01", "Тпру Галоп Стоять"));
        animalShelter.add(new Horse ("Графиня", "2015-03-01", "Тпру Галоп Стоять Апп"));
        animalShelter.add(new Hamster ("Пуф", "2021-02-20", "Умри"));
        animalShelter.add(new Hamster ("Пиф", "2021-02-20", "Умри"));
        animalShelter.add(new Hamster ("Машенька", "2021-02-20", "Умри"));

    }
}
