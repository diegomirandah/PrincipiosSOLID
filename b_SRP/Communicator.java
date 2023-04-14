package b_SRP;

public class Communicator {
    private String channel;

    public Communicator(String channel) {
        this.channel = channel;
    }

    public void communicate(Duck duck1, Duck duck2) {
        String sentence1 = String.format("%s: %s, hello %s", duck1.getName(), duck1.doSound(), duck2.getName());
        String sentence2 = String.format("%s: %s, hello %s", duck2.getName(), duck2.doSound(), duck1.getName());
        String[] conversation = {sentence1, sentence2};
        System.out.println(String.join("\n", conversation) + " (via " + this.channel + ")");
    }
}
