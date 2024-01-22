// source1 [John]: https://www.youtube.com/watch?v=jhDUxynEQRI
// source2 [Yale graduate]; https://www.youtube.com/watch?v=qqYOYIVrso0
// poly = many, morph = form

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog1 = new Dog();
        // Dog is an Animal, polymorphism allows this dynamic relationship
        Animal myDog2 = new Dog(); 
        myDog1.eat();

        Cat myCat = new Cat();
        myCat.eat(3, "manti");

        Animal[] Kingdom = new Animal[2];
        Kingdom[0] = myDog1;
        Kingdom[1] = myCat;

        for(Animal a : Kingdom) {
            a.eat();
        }
    }
}