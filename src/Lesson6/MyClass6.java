package Lesson6;

public class MyClass6 {
    public static void main(String[] args) {
        Dog dogZhuchka = new Dog();
        Dog dogSharik = new Dog(1000, 20, 1.1);
        Cat catMurzik = new Cat ();
        Animal catBarsik = new Cat(100, 5);

        System.out.println(dogZhuchka.run(1000));
        System.out.println(dogSharik.run(1000));
        System.out.println(dogSharik.jump(1));
        System.out.println(catBarsik.swim(10));
        System.out.println(catMurzik.jump(2));
    }
}
