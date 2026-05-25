// Last updated: 5/25/2026, 11:19:04 AM
class TrieNode {
    boolean isEnd=false;
    TrieNode child[]=new TrieNode[26];
}
class Trie {
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(curr.child[i]==null){
                curr.child[i]=new TrieNode();
               
            }
             curr=curr.child[i];
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(curr.child[i]==null){
                return false;
            }
            curr=curr.child[i];
            
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(char c:prefix.toCharArray()){
            int i=c-'a';
            if(curr.child[i]==null){
                return false;
            }
            curr=curr.child[i];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */