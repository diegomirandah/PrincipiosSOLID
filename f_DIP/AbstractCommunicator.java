package f_DIP;

public abstract class AbstractCommunicator {
    public abstract AbstractChannel getChannel();
    
    public final void communicate(AbstractConversation conversation) {
        for (String line : conversation.doConversation()) {
            System.out.println(String.join("\n", line, this.getChannel().getChannelMessage()));
        }
        
    }
}