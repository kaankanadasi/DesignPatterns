package CollegeBoard;

public class C1 {
    public C1() { /* implementation not shown */ }

    public void m1() 
    { System.out.print("A"); }

    public void m2()
    { System.out.print("B"); }
}

public class C2 extends C1 {
    public C2()
    { /* implementation not shown */ }

    public void m2()
    { System.out.print("C"); }
}
/* 
 * C1 obj1 = new C2();
 * obj1.m1();
 * obj1.m2();
 * 
 * Intended to produce the output AB -> code segment does not produce the intended output?
 * Method m2 is executed from the subclass instead of the superclass because obj1 is instantiated as a C2 object.
 * 
 * At runtime, the method in the class containing the constructor called to instantiate the object is executed. In this case, 
 * obj1 is instantiated by a call to the C2 constructor. The method m1 is not found in C2 so the superclass method m1 is executed,
 * printing "A". The method m2 is found in C2 so it is executed, printing "C".
*/