import editor.VScode;
import editor.WebStorm;
import language.TSX;
import language.Typescript;

public class Main {
    public static void main(String[] args) {
        Typescript typescript = new Typescript(new VScode());
        typescript.codeExample("index");

        TSX tsx = new TSX(new WebStorm());
        tsx.codeExample("index");
    }
}