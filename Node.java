import java.util.HashMap;

public class Node {

    private final HashMap<Character, Node> children = new HashMap<>();
    //    private char letter;
    private boolean isEndOfWord = false;

    public Node() {
    }


    public HashMap<Character, Node> getChildren() {
        return children;
    }

    public void setChildren(Character letter, Node node) {
        children.put(letter, node);
    }

    public boolean getIsEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

}
