package f_DIP;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Bird
        Duck duck1 = new Duck("Donald");
        Duck duck2 = new Duck("Daisy");
        Crow crow1 = new Crow("Russell");
        
        // Crear una instancia de SimpleConversation
        AbstractConversation conversation = new SimpleConversation(duck1, duck2);
        
        // Crear una instancia de SMSCommunicator
        AbstractCommunicator smsCommunicator = new SMSCommunicator();
        
        // Usar el método communicate() para mostrar la conversación
        System.out.println("SMS Conversation:");
        smsCommunicator.communicate(conversation);
        
        // Hacer que los pájaros vuelen
        duck1.fly();
        duck2.fly();
        crow1.fly();
        
        // Hacer que los patos naden
        duck1.swim();
        duck2.swim();
    }
}
