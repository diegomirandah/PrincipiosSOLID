package e_ISP;

public class Duck extends Bird implements SwimmingBird, FlyingBird{ 

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying not very high");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " swims in the lake and quacks");
    }

    @Override
    public String doSound() {
        return "Quack";
    }

}

