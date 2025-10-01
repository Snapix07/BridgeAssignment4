package types;

public abstract class IProgrammingLanguage {
    protected ICodeEditor codeEditor;
    protected IProgrammingLanguage(ICodeEditor codeEditor) {
        this.codeEditor = codeEditor;
    };
    public abstract void codeExample(String fileName);
}
