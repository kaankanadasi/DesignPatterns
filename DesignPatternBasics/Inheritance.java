// inheritance - mechanism for reusing code

public class Main {
    public static void main(String[] args) {
        var textBox = new textBox();
        textBox.enable();
    }
}

// parent class (superclass)
public class UIControl {
    public void enable() {
        System.out.println("Enabled");
    }
}

public class TexBox extends UIControl { }