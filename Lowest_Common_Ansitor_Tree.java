import java.util.*;
public class Lowest_Common_Ansitor_Tree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            Node left,right=null;
        }}
       
        public static boolean getPath(Node root,int n, ArrayList<Node> p){
            if(root==null){return false;}   
            p.add(root);
                if(root.data==n){
                    return true;
                }
                boolean foundl=getPath(root.left, n, p);
                boolean foundr=getPath(root.right, n, p);
                if(foundl || foundr){
                    return true;
                }
            p.remove(p.size()-1);
            return false;
        }
        public static Node lca(Node root,int n1,int n2){
            ArrayList<Node> p1=new ArrayList<>();
            ArrayList<Node> p2=new ArrayList<>();
            getPath(root,n1,p1);
            getPath(root,n1,p2);
            int i=0;
            for(;i<p1.size() && i<p2.size();i++){
                if(p1.get(i) !=p2.get(i)){
                    break;
                }
            }
            Node lca=p1.get(i-1);
            return lca;
            }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1=4,n2=5;
        System.out.println(lca(root,n1,n2));
    }

}