package TriesDS;

public class demo {
    static class Node{
        Node[] children;
        boolean eow;

        public Node() {
            this.children = new Node[26];
            for(int i=0;i<26;i++){
                this.children[i] = null;
            }
            this.eow=false;
        }
    }

    static Node root = new Node();
    static int size=1;

    public static void insert(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(node.children[idx] ==null){
                // add new node
                node.children[idx]=new Node();
                size++;
            }
            if(i==word.length()-1){
                node.children[idx].eow=true;
            }
            node = node.children[idx];
        }
    }

    public static boolean search(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++) {
            int idx = word.charAt(i) - 'a';
            if(node.children[idx]==null){
                return false;
            }
            else if(i==word.length()-1 && !node.children[idx].eow){
                return false;
            }
            node = node.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key) {
        if(key.isEmpty()){
            return true;
        }

        for(int i =1; i<=key.length();i++){
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }

        return false;
    }

    public static boolean startsWith(String text) {
        Node node=root;
        for(int i=0;i<text.length();i++){
            if(node.children[text.charAt(i)-'a']==null){
                return false;
            }
            node = node.children[text.charAt(i)-'a'];
        }
        return true;
    }

    public static int countUniqueWords(String word) {
        for(int i=0;i<word.length();i++){
            insert(word.substring(i));
        }
        return size;
    }

    static String ans ="";
    public static void longestWord(Node root, StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow) {
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans= String.valueOf(temp);
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
//        String[] words = {"the", "a", "there", "their","any","none"};
//
//        for(int i=0;i<words.length;i++) {
//            insert(words[i]);
//        }
//
//        System.out.println(search("their"));
//        System.out.println(search("an"));
//        System.out.println(search("they"));

//        String[] words = {"i", "like", "sam", "samsung","mobile"};
//
//        for(int i=0;i<words.length;i++) {
//            insert(words[i]);
//        }
//
//        System.out.println(wordBreak("ilikesamsung"));
//
//        System.out.println(wordBreak("ilikesung"));

//        String[] words = {"apple","app","mango","man","women"};
//        for(int i=0;i<words.length;i++) {
//            insert(words[i]);
//        }
//        System.out.println(startsWith("app"));
//        System.out.println(startsWith("moon"));

//        System.out.println(countUniqueWords("ababa"));

        String[] words = {"a","banana","app","appl","ap","apply","applei"};
        for(int i=0;i<words.length;i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}
