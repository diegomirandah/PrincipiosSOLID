package e_ISP;
import java.util.List;

public class Communicator {
    private final String channel;

    public Communicator(String channel) {
        this.channel = channel;
    }

    public final void communicate(AbstractConversation conversation) {
        List<String> conversationLines = conversation.doConversation();
        for (String line : conversationLines) {
            System.out.println(line);
        }
        System.out.println("(via " + channel + ")");
    }
}