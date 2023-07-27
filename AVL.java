public class AVL {
    static class Node{
        int data,height;
        Node left,right;

        Node(int data,int height){
            this.data=data;
            this.height=height;
        }
    }
    public static Node root;

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }

    // public static Node rightRotate(Node y){
    //     Node x;
    // }
public static Node insert(Node root,int key){
    if(root==null){
        return new Node(key,0);
    }
    if(key<root.data){
        root.left=insert(root.left,key)
    }
}
    public static void main(String[] args) {
        root=insert(root,10);

    }
}
