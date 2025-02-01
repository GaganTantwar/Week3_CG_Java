package doublylinkedlist.undoredofunctionality;

public class UndoRedoFunctionality {
    public static void main(String[] args) {
        UndoRedo editor = new UndoRedo(10);

        editor.addState("C++ Tutorial");
        editor.addState("Java Tutorial!");
        editor.displayCurrentTask(); // Output:Java Tutorial

        editor.undo();
        editor.displayCurrentTask(); // Output: C++ Tutorial

        editor.redo();
        editor.displayCurrentTask(); // Output: Java Tutorial

        editor.addState("Python Tutorial");
        editor.displayCurrentTask(); // Python Tutorial

        editor.undo();
        editor.displayCurrentTask(); // Output: Java Tutorial
    }
}
