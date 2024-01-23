// source1 [John]: https://www.youtube.com/watch?v=jhDUxynEQRI
// source2 [John]: https://www.youtube.com/watch?v=HpuH7n9VOYk&t=94s
// source3 [Yale graduate]; https://www.youtube.com/watch?v=qqYOYIVrso0
// poly = many, morph = form

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat(); // yum yum
        doAnimalStuff(myAnimal); // I'm an animal

        Dog myDog1 = new Dog();
        myDog1.eat(); // nice
        myDog1.growl(); // Grrrrrr
        doAnimalStuff(myDog1); // Grrrrrr

        Animal myDog2 = new Dog(); // upcasting, Dog is-a Animal
        myDog2.eat(); // yum yum
        myDog2.growl(); // COMPILATION ERROR!!! THIS DOES NOT WORK BECAUSE ANIMAL CLASS DOES NOT HAVE bark() METHOD
        doAnimalStuff(myDog2); // Grrrrrr

        Cat myCat = new Cat();
        myCat.eat(2, "manti"); // yum yum manti - yum yum manti
        doAnimalStuff(myCat); // meow meow

        Animal[] Kingdom = new Animal[2];
        Kingdom[0] = myDog1;
        Kingdom[1] = myCat;

        for(Animal a : Kingdom) {
            a.eat();
        }
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        if (animal instanceof Dog) {
            Dog myDog = (Dog) animal; // downcasting
            myDog.growl();
        }
    }
}