package e_ISP;

public class Crow extends Bird implements FlyingBird{
    
    public Crow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying high and fast!\n", this.getName());
    }
    
    /*Esto se puede borrar
    
    @Override
    public void swim() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Crows don't swim!");
    } 
    
    */
    
    @Override
    public String doSound() {
        return "Caw";
    }
    
}
