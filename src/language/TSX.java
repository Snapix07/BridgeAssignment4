package language;

import types.ICodeEditor;
import types.IProgrammingLanguage;

public class TSX extends IProgrammingLanguage {
    public TSX(ICodeEditor codeEditor) {
        super(codeEditor);
    }

    public void codeExample(String fileName) {
        codeEditor.openCodeEditor(fileName + ".tsx");
        System.out.println("export const Component = ():ReactElement =>{\n" +
                "return <div>\n" +
                "       Software Design Patterns\n" +
                "   </div>");
    }
}
