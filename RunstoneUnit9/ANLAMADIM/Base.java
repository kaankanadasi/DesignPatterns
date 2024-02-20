// Given the following class declarations, and assuming that the following declaration appears in a client program: 
// Base b = new Derived();, what is the result of the call b.methodOne();?

public class Base {
    public void methodOne() {
        System.out.print("A");
        methodTwo();
    }
    public void methodTwo() {
        System.out.print("B");
    }

    public class Derived extends Base {
        public void methodOne() {
            super.methodOne();
            System.out.print("C");
        }
        public void methodTwo() {
            super.methodTwo();
            System.out.print("D");
        }
    }
}



// Output: ABDC
// methodOne() içindeki methodTwo() çağırıldığında bu ilk başta Derived subclass'ının içindeki super.methodTwo()'ya gidiyor, 
// ordan Base superclass'ının içindeki methodTwo() çalışıyor ["B"] sonra subclass'a geri dönüyor ve "D" print ediliyor

/*
 * Even though b is declared as type Base it is created as an object of the Derived class, so all methods to it will be resolved 
 * starting with the Derived class. So the methodOne() in Derived will be called. This method first calls super.methodOne so this 
 * will invoke the method in the superclass (which is Base). So next the methodOne in Base will execute. This prints the letter "A" 
 * and invokes this.methodTwo(). Since b is really a Derived object, we check there first to see if it has a methodTwo. It does, 
 * so execution continues in Derived's methodTwo. This method invokes super.methodTwo. So this will invoke the method in the 
 * super class (Base) named methodTwo. This method prints the letter "B" and then returns. Next the execution returns from the 
 * call to the super.methodTwo and prints the letter "D". We return to the Base class methodOne and return from that to the 
 * Derived class methodOne and print the letter "C".
*/