//import Any type
import java.lang.Object;

public class Tree {
    private static Object _root = null;
    private static Tree[] _subtrees = null;
    public Tree(Object root, Tree[] subtrees) {
        _root = root;
        if (subtrees == null) {
            _subtrees = new Tree[0];
        } else {
            _subtrees = subtrees;
        }
    }
}
