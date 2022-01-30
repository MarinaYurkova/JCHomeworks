package ru.geekbrains.lesson4;

public class Main {

    public static void main(String[] args) {
        makePhoneBook();
        System.out.println();
        Words wordsArray = new Words(createArrayWords());
        wordsArray.shiftWords();
    }

    private static void makePhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Putin", "89130000000");
        phoneBook.addElementPhoneBook("Navalny", "89239000000");
        phoneBook.addElementPhoneBook("Jirinovsky", "89520000101");
        phoneBook.addElementPhoneBook("Volodin", "89990000001");
        phoneBook.addElementPhoneBook("Volodin", "89990000002");

        System.out.println("Putin: " + phoneBook.getPhonesByName("Putin"));
        System.out.println("Navalny: " + phoneBook.getPhonesByName("Navalny"));
        System.out.println("Jirinovsky: " + phoneBook.getPhonesByName("Jirinovsky"));
        System.out.println("Volodin: " + phoneBook.getPhonesByName("Volodin"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[15];
        strings[0] = "Stol";
        strings[1] = "Stul";
        strings[2] = "Dver";
        strings[3] = "Odeyalo";
        strings[4] = "Okno";
        strings[5] = "Stul";
        strings[6] = "Dver";
        strings[7] = "Zvezda";
        strings[8] = "Stol";
        strings[9] = "Batareya";
        strings[10] = "Comp";
        strings[11] = "Zerkalo";
        strings[12] = "Zvezda";
        strings[13] = "Batareya";
        strings[14] = "Pol";
        return strings;
    }
}

