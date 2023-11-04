import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public Menu() {

    }

    public void start(AnimalShelter animalShelter) {
        printMenu();
        while (true) {
            System.out.print("Выберите пункт меню: ");
            switch (sc.nextLine()) {
                //Список всех животных
                case "1" -> printAnimalList(animalShelter);
                //Добавление животного
                case "2" -> createNewAnimal(animalShelter);
                //Список команд животного
                case "3" -> {
                    System.out.print("Введите id животного: ");
                    Animal animal = findAnimalById(animalShelter, sc.nextLine());
                    if (animal == null) {
                        System.out.println("Животное с таким id не найдено.");
                    } else {
                        System.out.println(animal.name + " знает команды: " + animal.commands);
                    }
                }
                //Добавление команды животному
                case "4" -> {
                    System.out.print("Введите id животного: ");
                    Animal animal = findAnimalById(animalShelter, sc.nextLine());
                    if (animal == null) {
                        System.out.println("Животное с таким id не найдено.");
                    } else {
                        System.out.print("Введите новую команду для " + animal.name + ": ");
                        animal.commands = animal.commands + " " + sc.nextLine();
                        System.out.println("Команда добавлена.");
                    }
                }
                //Количество животных по видам
                case "5" -> printAnimalsCounters();
                //Выход
                case "0" -> {
                    System.out.println("Завершение работы.");
                    BDService.saveToBD(animalShelter);
                    System.exit(0);
                }
                case "help" -> printMenu();
                default -> System.out.println("Неверный ввод");
            }
        }
    }

    private static void printMenu() {
        System.out.println("""
                1 - Список всех животных
                2 - Добавление животного
                3 - Список команд животного
                4 - Добавление команды животному
                5 - Количество животных по видам
                0 - Выход
                help - Вывести меню""");
    }

    private static void printAnimalList(AnimalShelter animalShelter) {
        for (Animal animal : animalShelter.animalList) {
            System.out.println(animal);
        }
    }

    private static void printAnimalsCounters() {
        System.out.println("Всего животных в питомнике: " + Animal.animalCount + "\n" +
                "Домашних животных: " + Pet.typeCount + "\n" + "Кошек: " + Cat.classCounter + "\n" +
                "Собак: " + Dog.classCounter + "\n" + "Хомячков: " + Hamster.classCounter + "\n" +
                "Вьючных животных: " + PackAnimal.typeCount + "\n" + "Лошадей: " + Horse.classCounter + "\n" +
                "Верблюдов: " + Camel.classCounter + "\n" + "Ослов: " + Donkey.classCounter);
    }

    private static Animal findAnimalById(AnimalShelter animalShelter, String id) {
        for (Animal animal : animalShelter.animalList) {
            if (animal.id.equals(id)) return animal;
        }
        return null;
    }

    private void createNewAnimal(AnimalShelter animalShelter) {

        while (true) {
            System.out.println("""
                    1 - Собака
                    2 - Кошка
                    3 - Хомяк
                    4 - Лошадь
                    5 - Верблюд
                    6 - Осёл
                    0 - Выход""");
            System.out.print("Выберите вид животного: ");
            switch (sc.nextLine()) {
                //Выход из меню
                case "0" -> {
                    System.out.println("Операция прервана.");
                    return;
                }
                //Создать новую собаку
                case "1" -> {
                    animalShelter.add(new Dog(createName(), createYear() + "-" + createMonth() + "-" +
                            createDate(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                //Создать новую кошку
                case "2" -> {
                    animalShelter.add(new Cat(createName(), createYear() + "-" + createMonth() + "-" +
                            createDate(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                //Создать нового хомяка
                case "3" -> {
                    animalShelter.add(new Hamster(createName(), createYear() + "-" + createMonth() + "-" +
                            createDate(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                //Создать новую лошадь
                case "4" -> {
                    animalShelter.add(new Horse(createName(), createYear() + "-" + createMonth() + "-" +
                            createDate(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                //Создать нового верблюда
                case "5" -> {
                    animalShelter.add(new Camel(createName(), createYear() + "-" + createMonth() + "-" +
                            createDate(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                //Создать нового осла
                case "6" -> {
                    animalShelter.add(new Donkey(createName(), createYear() + "-" + createMonth() + "-" +
                            createDate(), createCommands()));
                    System.out.println("Животное успешно добавлено!");
                    return;
                }
                default -> System.out.println("Неверный ввод");
            }
        }
    }

    private String createName() {
        System.out.print("Введите имя нового животного: ");
        return sc.nextLine();
    }

    private String createYear() {
        System.out.print("Введите год рождения нового животного: ");
        return sc.nextLine();
    }

    private String createMonth() {
        System.out.print("Введите месяц рождения нового животного: ");
        return sc.nextLine();
    }

    private String createDate() {
        System.out.print("Введите день рождения нового животного: ");
        return sc.nextLine();
    }

    private String createCommands() {
        System.out.print("Введите список команд нового животного через пробел: ");
        return sc.nextLine();
    }
}
