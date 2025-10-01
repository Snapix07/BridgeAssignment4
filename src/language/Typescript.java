package language;

import types.ICodeEditor;
import types.IProgrammingLanguage;

public class Typescript extends IProgrammingLanguage {
    public Typescript(ICodeEditor codeEditor) {
        super(codeEditor);
    }

    public void codeExample(String fileName) {
        codeEditor.openCodeEditor(fileName +".ts");
        System.out.println("interface CodeExample {\n" +
                "   grade:number;\n" +
                "   extraScore?:number;\n" +
                "   name:string;\n" +
                "}\n\n" +
                "const setGrade = ({items}:CodeExample):number => {\n" +
                "   const {grade}=items\n" +
                "   return grade\n" +
                "}");

    }
}
