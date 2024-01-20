/*
    BASICS JAVA 
   -------------
 * public - accessiable anywhere in this codebase
 * static - we can call this method directly without creating an instance of the main class
 * void - does not return anything
 * in the paranthesis we have the parameters of the method (a string array called args), if we execute this program from the 
   command line and pass a few arguments, we can capture those arguments using the string array
*/

public class Main {
    public static void(String[] args) {
        User user = new User("Mosh"); 
        user.sayHello();
    }
}

public class User {
    // Fields (attributes)
    public String name;

    // Constructor - a method that gets called when we create a new instance of a class
    public User(Stirg name) {
        this.name = name; // set the name field of the current object to the value of the name parameter
    } 
    // Methods
    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
} 

