public class Dog extends Animal {
    private int breed;
 
    // overriding a method is a kind of polymorphism - we are doing the same thing in a different form
    @Override
    public void eat() {
        System.out.println("nice");
    }
    public void growl() {
        System.out.println("Grrrrrr");
    }
    public void makeNoise() {
        System.out.println("wof wof");
    }
    public int getBreed() {
        return breed;
    }
    public void setBreed(int breed) {
        this.breed = breed;
    }
}