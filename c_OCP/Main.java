package c_OCP;

public class Main {
    public static void main(String[] args) {
        Duck daffy = new Duck("Daffy");
        Duck donald = new Duck("Donald");
        Communicator communicator = new Communicator("telegraph");
        AbstractConversation simpleConversation = new SimpleConversation(daffy, donald);
        
        daffy.fly();
        donald.fly();
        
        communicator.communicate(simpleConversation);
    }
}

