import java.util.*;
public class Connect_N_Ropes {
    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>( );
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
                int min=pq.remove();
                int next=pq.remove();
                cost+=min+next;
                pq.add(min+next);
        }
        System.out.print("The total cost is:"+cost);
    }
}
