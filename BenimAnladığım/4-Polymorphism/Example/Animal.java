// superclass/parent class
public class Animal {
    private String name;
    
    public void eat() {
        System.out.println("yum yum");
    }
    public void makeNoise() {
        System.out.println("I'm an animal");
    }
    // getter method
    public String getName() {
        return name;
    }
    // setter method
    public void setName(String name) {
        this.name = name;
    }
}