package b_SRP;

public class Main {
    public static void main(String[] args) {
        Duck daffy = new Duck("Daffy");
        Duck donald = new Duck("Donald");
        Communicator communicator = new Communicator("telegraph");
        
        daffy.fly();
        donald.fly();
        
        communicator.communicate(daffy, donald);
    }
}

