public class Main {
    public static void main(String[] args) {

        //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        //   Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        //   Посчитать сколько раз встречается каждое слово.

        System.out.println("Задание 1");

        Fruit basket = new Fruit();

        basket.add("банан");
        basket.add("лимон");
        basket.add("киви");
        basket.add("авокадо");
        basket.add("киви");
        basket.add("яблоко");
        basket.add("лимон");
        basket.add("апельсин");
        basket.add("авокадо");
        basket.add("лимон");


        System.out.printf("Список слов в единственном экземпляре: %s;%n", basket.getUnique());
        System.out.printf("Список уникальных слов, из которых состоит массив и их количество: %s.%n%n", basket.calculate());


        //2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        //   В этот телефонный справочник с помощью метода add() можно добавлять записи.
        //   С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть
        //   несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

        System.out.println("Задание 2");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new PhoneContact("Иванов", "+97580000000"));
        phoneBook.add(new PhoneContact("Петров", "+97580000001"));
        phoneBook.add(new PhoneContact("Сидоров", "+97580000002"));
        phoneBook.add(new PhoneContact("Семенов", "+97580000003"));
        phoneBook.add(new PhoneContact("Фёдоров", "+97580000004"));
        phoneBook.add(new PhoneContact("Сидоров", "+97580000005"));
        phoneBook.add(new PhoneContact("Семенов", "+97580000006"));
        phoneBook.add(new PhoneContact("Макаров", "+97580000007"));
        phoneBook.add(new PhoneContact("Иванов", "+97580000008"));
        phoneBook.add(new PhoneContact("Петров", "+97580000009"));
        phoneBook.add(new PhoneContact("Степанов", "+97580000010"));

        System.out.printf("Поиск номера телефона по фамилии: %s.%n", phoneBook.get("Иванов"));
    }

}