package f_DIP;

public class SMSCommunicator extends AbstractCommunicator {
    private AbstractChannel channel;
    
    public SMSCommunicator() {
        this.channel = new SMSChannel();
    }
    
    public SMSCommunicator(AbstractChannel channel) {
        this.channel = channel;
    }
    
    public AbstractChannel getChannel() {
        return this.channel;
    }
}