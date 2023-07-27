
import java.util.*;
public class Majority_Element {

    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,5,1};
        HashMap<Integer,Integer>hp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(hp.containsKey(num)){
                hp.put(num,hp.get(num)+1);
            }else{
            hp.put(num,1);
        }

    }
    Set<Integer>keyset=hp.keySet();
    for(Integer key: keyset){
        if(hp.get(key)>arr.length/3){
            System.out.println(key);
        }
    }
}
}