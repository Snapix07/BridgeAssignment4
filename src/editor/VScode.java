package editor;

import types.ICodeEditor;

public class VScode implements ICodeEditor {
    public void openCodeEditor(String fileName) {
        System.out.println("The VSCode is opened and running " + fileName );
    }
}
