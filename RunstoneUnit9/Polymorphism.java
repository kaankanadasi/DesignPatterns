/*
 * In Java an object variable has both a declared (compile-time) type and an actual (run-time) type. The declared (compile-time) 
 * type of a variable is the type that is used in the declaration. The actual (run-time) type is the class that actually creates 
 * the object using new.
*/

/*
  * The variable nameList declared below has a declared type of List and an actual or run-time type of ArrayList. The compiler will 
  * check if the declared type has the methods or inherits the methods being used in the code and give an error if it doesn’t find the 
  * method(s). The List interface does have an add method so this code will compile. At run-time the execution environment will first 
  * look for the add method in the ArrayList class since that is the actual or run-time type. If it doesn’t find it there it will look 
  * in the parent class and keep looking up the inheritance tree until it finds the method. It may go up all the way to the Object class.
  * The method will be found, since otherwise the code would not have compiled.
*/

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    // declared type: List, run-time/actual type: ArrayList
    List<String> nameList = new ArrayList<String>();

    // declared type: Object, run-time/actual type: String
    Object message = new String("hi");
    // message.indexOf("h"); COMPILER ERROR!! Object class does not have an indexOf method.
}

public class Student {
    public String getFood() {
        return "Pizza";
    }

    public String getInfo() {
        return this.getFood();
    }

    public static void main(String[] args) {
        Student s1 = new GradStudent();
        System.out.println(s1.getInfo()); // prints: Taco
        // Even though the getInfo method is in Student when getFood is called the run-time will look for that 
        // method first in the class that created this object which in this case is the GradStudent class.
    }
}

class GradStudent extends Student {
    public String getFood() {
        return "Taco";
    }
}


/*
 * polymorphism - The runtime type of an object can be that type or any subclass of the declared type. All method calls are resolved 
 * starting with the class that created the object. If the method isn’t found in the class that created the object, then it will look 
 * in the parent class and keep looking up the inheritance tree until it finds the method. The method must exist, or the code would 
 * not have complied.
 * 
 * static - Keyword used to indicate that a instance variable or method is part of the class and not part of each object created by 
 * the class.
 * 
 * super - Keyword used to call a method in a parent class. This is useful if a child class overrides an inherited method, but still 
 * wants to call it.
 * 
 * actual type - the class that created the object
 * decleared type - the type of the object was decleared as
*/