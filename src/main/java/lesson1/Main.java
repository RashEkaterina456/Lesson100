package lesson1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", "белый", 1);
        System.out.println(cat1);

        Cat cat2 = new Cat("Морис", "black", 1);
        Cat cat3 = new Cat("Морис", "black", 1);

        System.out.println(cat2.equals(cat3));

    }


}
