// not the best impl because I used some prints in search func, but is just an extra if for better study
public class PrefixTree {

    private Node root = new Node();

    public PrefixTree() {
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    public void insert(String word) {
        Node current = root;

        char[] letters = word.toCharArray();
        for (char letter : letters) {
            if (!current.getChildren().containsKey(letter)) {
                current.setChildren(letter, new Node());
            }
            current = current.getChildren().get(letter);
        }
        current.setEndOfWord(true);
    }

    public boolean search(String word) {
        System.out.printf("Word %s: ", word);
        Node current = root;

        char[] letters = word.toCharArray();

        for (char letter : letters) {
            if (!current.getChildren().containsKey(letter)) {
                System.out.println("doesn't appear in Trie");
                return false;
            }
            current = current.getChildren().get(letter);
        }
        if (!current.getIsEndOfWord()) {        //extra if just for better logs
            System.out.println("doesn't appear in Trie");
            return false;
        }
        System.out.println("appears in Trie");
        return true;
    }

    public boolean startsWith(String word) {
        Node current = root;

        char[] letters = word.toCharArray();

        for (char letter : letters) {
            if (!current.getChildren().containsKey(letter)) {
                System.out.printf("Doesn't start with: %s\n", word);
                return false;
            }
            current = current.getChildren().get(letter);
        }
        System.out.printf("Start with: %s\n", word);
        return true;
    }
}
