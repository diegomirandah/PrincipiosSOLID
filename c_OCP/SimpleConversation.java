package c_OCP;
import java.util.Arrays;
import java.util.List;

public class SimpleConversation extends AbstractConversation {
    private Duck duck1;
    private Duck duck2;

    public SimpleConversation(Duck duck1, Duck duck2) {
        this.duck1 = duck1;
        this.duck2 = duck2;
    }
 
    @Override
    public List<String> doConversation() {
        String sentence1 = String.format("%s: %s, hello %s", duck1.getName(), duck1.doSound(), duck2.getName());
        String sentence2 = String.format("%s: %s, hello %s", duck2.getName(), duck2.doSound(), duck1.getName());
        return Arrays.asList(sentence1, sentence2);
    }
}
