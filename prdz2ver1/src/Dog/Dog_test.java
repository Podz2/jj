package Dog;

public class Dog_test {
    public static void main(String[] args){

        Dog d1 = new Dog(9, "Шарик");

        Dog d2 = new Dog(2, "Бобик");

        Nursery n = new Nursery();;

        n.addDog(d1, d2);

        n.printDogs();

    }
}
