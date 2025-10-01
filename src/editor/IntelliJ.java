package editor;

import types.ICodeEditor;

public class IntelliJ implements ICodeEditor {
    public void openCodeEditor(String fileName) {
        System.out.println("The IntelliJ is opened and running " + fileName);

    }
}
