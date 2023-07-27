import java.util.*;
public class Max_Sum_Subbarray_0 {
    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(arr[0],0);
        int sum=arr[0];
        int length=0;
        for(int i=1;i<arr.length;i++){
        sum=sum+arr[i];
        if(hm.containsKey(sum)){
        length=Math.max(length,i-hm.get(sum));
        }
        else{
            hm.put(sum,i);
        }
        }
        System.out.println(length);
    }
}
