public class Tries {

    static class Node{
        Node children[]=new Node[26];
        boolean endodword=false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node cur=root;
        for(int i=0;i<word.length();i++){
           int idx=word.charAt(i)-'a';
           if(cur.children[idx]==null){
            cur.children[idx]=new Node();
           }else{
            cur=cur.children[idx];
           }
        }
        cur.endodword=true;
    }

    public static boolean search(String str){
        Node cur=root;
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(cur.children[idx]==null){
                return false;
            }
            else{
                cur=cur.children[idx];
            }
        }
        return cur.endodword;
    }
    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("thea"));
    }
}
