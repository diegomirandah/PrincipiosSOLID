package f_DIP;

public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    public abstract String doSound();
}
