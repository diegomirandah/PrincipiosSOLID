package a_Inicio;
public class Duck {
    private String name;
    
    public Duck(String name) {
        this.name = name;
    }
    
    public void fly() {
        System.out.println(this.name + " is flying not very high");
    }
    
    public void swim() {
        System.out.println(this.name + " swims in the lake and quacks");
    }
    
    public String doSound() {
        return "Quack";
    }
    
    public void greet(Duck duck2) {
        System.out.println(this.name + ": " + this.doSound() + ", hello " + duck2.name);
    }
}

