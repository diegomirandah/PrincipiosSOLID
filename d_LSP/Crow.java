package d_LSP;

public class Crow extends Bird {
    
    public Crow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying high and fast!\n", this.getName());
    }
    
    @Override
    public void swim() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Crows don't swim!");
    }
    
    @Override
    public String doSound() {
        return "Caw";
    }
    
}
