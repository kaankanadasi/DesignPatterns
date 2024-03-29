// source: https://www.javatpoint.com/runtime-polymorphism-in-java

class Animal {  
    public void sound() {
        System.out.println("sounding");
    }
    void eat() {
        System.out.println("eating");
    }  
}  

class Dog extends Animal {  
    void eat() {
        System.out.println("eating fruits");
    }  
}  

class BabyDog extends Dog {  
    void eat() { 
        System.out.println("drinking milk"); 
    }  
    public static void main(String args[]) {  
        Animal a1,a2,a3;  
        a1 = new Animal();  
        a2 = new Dog();  
        a3 = new BabyDog();  
        a1.eat(); // eating
        a2.eat(); // eating fruits
        a3.eat(); // drinking Milk
        a3.sound(); // sounding [looks at the class hierarcy]
    }  
}  