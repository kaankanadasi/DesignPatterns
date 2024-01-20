// Memento - lets you save and restore the previous state of an object without revealing the details of its implementation.

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("C");
        editor.restore(history.pop());

        System.put.println(editor.getContent()) // outputs "B"
    }
}