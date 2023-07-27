public class Word_Break_Problem {
    static class Node{
        Node children[]=new Node[26];
        boolean end=false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
   public static Node root = new Node();

    public static void insert(String word) {
        Node currNode = root;
        for (int i = 0; i < word.length(); i++) {
            int indx = word.charAt(i) - 'a';
            if (currNode.children[indx] == null) {
                currNode.children[indx] = new Node();
            }
            currNode = currNode.children[indx];
        }
        currNode.end = true;
    }
     public static boolean search(String word) {
        Node currNode = root;
        for (int i = 0; i < word.length(); i++) {
            int indx = word.charAt(i) - 'a';
            if (currNode.children[indx] == null) {
                return false;
            } else {
                currNode = currNode.children[indx];
            }
        }
        return currNode.end == true;
    }
    public static boolean wordB(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
           if(search( key.substring(0,i)) && wordB(key.substring(i))){
            return true;
           } 
        }
        return false;
    }
    public static void main(String[] args) {
        String[] str={ "i", "like", "sam", "samsung", "mobile", "ice" };

        String key = "ilikesam";
        for(int i=0;i<str.length;i++){
            insert(str[i]);
        }
System.out.println(wordB(key));
    }
}
