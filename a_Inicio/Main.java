package a_Inicio;
public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck("Donald");
        Duck duck2 = new Duck("Daisy");
        
        duck1.fly();
        duck1.swim();
        System.out.println(duck1.doSound());
        duck1.greet(duck2);
    }
}
