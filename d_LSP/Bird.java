package d_LSP;

public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void fly();
    public abstract void swim();
    public abstract String doSound();
}
