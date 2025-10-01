package editor;

import types.ICodeEditor;

public class WebStorm implements ICodeEditor {
    public void openCodeEditor(String fileName) {
        System.out.println("The WebStorm is opened and running " + fileName);
    }
}
