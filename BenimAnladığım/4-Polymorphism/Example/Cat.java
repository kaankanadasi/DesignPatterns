public class Cat extends Animal {
    private int breed;
 
    @Override
    public void eat() {
        System.out.println("num num num");
    }
    @Override
    public void makeNoise() {
        System.out.println("meow meow");
    }

    // method overloading is a kind of polymorphism  - methods that share the same name but have different parameters 
    public void eat(int numTimes, String food) { 
        for(int i = 0; i < numTimes; i++) {
            System.out.print("yum yum " + food + " - ");
        }
    }
    public int getBreed() {
        return breed;
    }
    public void setBreed(int breed) {
        this.breed = breed;
    }
}