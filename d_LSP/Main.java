package d_LSP;

public class Main {
    public static void main(String[] args) {
        Duck daffy = new Duck("Daffy");
        Crow donald = new Crow("Donald");
        Communicator communicator1 = new Communicator("telegraph");
        AbstractConversation simpleConversation = new SimpleConversation(daffy, donald);
        
        daffy.fly();
        donald.fly();
        
        communicator1.communicate(simpleConversation);
    }
}

