public class Main {
    public static void main(String[] args) {

        PrefixTree trie = new PrefixTree();

        trie.insert("Python");
        trie.insert("PHP");
        trie.insert("Golang");

        trie.search("PHP");     // Return True
        trie.search("Java");    // Return False
        trie.search("Pyt");     // Return False

        if (trie.search("Python"))      // Return True
            trie.startsWith("Pyt");             // Return True
        trie.startsWith("Javascript");      // Return False

        trie.startsWith("Golang");                // Return True
        trie.search("Golang");                // Return True
    }
}
