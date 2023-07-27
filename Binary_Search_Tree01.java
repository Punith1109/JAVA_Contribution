import java.util.*;
public class Binary_Search_Tree01 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;}
        inorder(root.left);
        System.out.print(root.data+" ");    
        inorder(root.right);
    }
    public static boolean search(Node root,int v){
        if(root==null){
            return false;
        }
        if(root.data==v){
            return true;
        }
        if(root.data>v){
           return search(root.left,v);
        }
        else{
           return search(root.right,v);
        }
    }
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }
        else{
            if(root.left==null &&root.right==null){
                return null;
            }//case 1 root_Leaf
            else if(root.left==null){
                return root.right;//case 2-> one child is null
            }
            else if(root.right==null){
                return root.left;
            }
            //both childeren are not null
            Node is= findinorder(root.right);
            root.data=is.data;
            root.right=delete(root.right,is.data);
        }
            return root;
    }

  public static Node findinorder(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
  }  
//   public static void printInRange(Node root,int k1,int k2){
//     if(root.data>=k1 &&root.data<=k2){
//         printInRange(root.left, k1, k2);
//         System.out.print(root.data+" ");
//         printInRange(root.right, k1, k2);
//     }

//   }
public static void printpath(ArrayList<Integer>path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+" ");
    }
    System.out.println();
}
public static void route(Node root,ArrayList<Integer> path){

    if(root==null){
        return;
    }
    path.add(root.data);
    if(root.left==null && root.right==null){
        printpath(path);
    }
    route(root.left,path);
    route(root.right,path);
    path.remove(path.size()-1);
}

public static boolean isValide(Node root,Node min,Node max){
    if(root==null){
        return true;
    }
    if(min !=null && root.data<=min.data ){
        return false;
    }
    else if(max!=null && root.data>=max.data){
        return false;
    }
    return isValide(root.left, min, root)
 && isValide(root, root, max);}

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        // inorder(root);
        // // System.out.print(search(root, 9));
        // System.out.println();
        // delete(root,1);
        // inorder(root);
        route(root,new ArrayList<>());
    }
}
