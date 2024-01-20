// inheritance - mechanism for reusing code
// polymorphism - ability of an object to take many forms

public class Main {
    public static void main(String[] args) {
        var textBox = new textBox();
        textBox.enable();
        drawUIControl(new TextBox());
    }
    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}

// parent class (superclass)
public abstract class UIControl {
    public void enable() {
        System.out.println("Enabled");
    }
    public abstract void draw() // this method does not have implementation -> abstract 
}

public class TexBox extends UIControl { 
    @Override 
    public void draw() {
        System.out.println("Drawing a textbox");
    }
}

public class CheckBox extends UIControl { 
    @Override 
    public void draw() {
        System.out.println("Drawing a checkBox");
    }
}