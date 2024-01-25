// source1: https://www.youtube.com/watch?v=Qb_NUn0TSAU

// subclass'ların superclass'ların methodlarını kullanabilemsi için variable'larının ve constructor'unun initilzie edilmesi lazım
// bunun için super() keyword'ünü kulanıyoruz, bu yüzden constructorumuzun body'sinde super()'i ilk başa yazmalıyız 
// eğer superclass'da bir parametre yoksa ya da defualt constructor varsa super8) heyword'ünü yazmamız gerekmiyor, otomatik olarak 
// Java compiler bu işlemi yapıyor,      ...       bence

// 1 - super keyword'ü ile subclassların içinde overriden olan methodları superclass versiyonu olarak çağırabiliriz

class A {
    public void method() {
        System.out.println("A method");
    }
}
class B extends A {
    @Override
    public void method() { // eğer method'lardan biri private olsaydı çağırılamazdı [encapsulation]
        System.out.println("B method");
        super.method();
    }
}
class C extends B {
    @Override
    public void method() {
        System.out.println("C method");
        super.method();
    }
}
class D extends C {
    @Override
    public void method() {
        System.out.println("D method");
        super.method();
    }
}

public class Main {
    public static void main(String[] args) {
        D d = new D();
        d.method();
    }
}

/*
    D method
    C method
    B method
    A method 
*/


/*
 * If you don't use super() in the subclass constructor, the superclass constructor won't be called, and the attributes or methods 
 * in the superclass may not be properly initialized. This can lead to issues when trying to use methods or access attributes from the 
 * superclass that depend on proper initialization.
*/


public class App {
    private double gb;
    private String type;

    public App(double gb, String type) {
        super();
        this.gb = gb;
        this.type = type;
    }
    @Override
    public String toString() {
        return "toString";
    }
    public void again() {
        System.out.println("something");
    }
    public String getType() {
        return type;
    }
}

public class X extends App {
    private double premiumPrice;
    private String owner;

    public X(double gb, String type, double premiumPrice, String owner) {
        super(gb, type);
        this.owner = owner;
        this.premiumPrice = premiumPrice;
    }
    @Override
    public String toString() {
        return "toString method" + super.toString();
    }
    @Override
    public void again() {
        System.out.println("something " + toString() + " " + super.getType());
    }
}

public class Main {
    public static void main(String[] args) {
        App twitter = new X(12.2, "news", 10, "Elon Musk");
        twitter.again(); // prints: something toString method news
    }
}


-------------------------------------

class MyBaseClass extends Object {
}
class MySubClass extends MyBaseClass {
    public void someMethod() {
        String result = super.toString(); // Calls Object's toString
        System.out.println(result);
    }
}
public class Main {
    public static void main(String[] args) {
        MySubClass a = new MySubClass();
        a.someMethod(); // returns: MySubClass@<hashcode>
    }
}