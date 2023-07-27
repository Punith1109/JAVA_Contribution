import java.util.*;
public class Has_Map_Implementation {

    static class Hashmap<K,V>{
        private class Node{
            K key;
            V value;

            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public Hashmap(){
            this.n=4;
            this.buckets=new LinkedList[4];
            this.N=4;
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashfunction(K key){
            int hc=key.hashCode(); //23454 or -34543
           return Math.abs(hc)% N;
        }
        private int SearchInLL(K key,int bi){
            int di=0;
            LinkedList<Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                else{
                    di++;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldbucket[]=buckets;
            buckets=new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            for(int i=0;i<oldbucket.length;i++){
                LinkedList<Node> ll=oldbucket[i];
                for(int j=0;j<ll.size;j++){
                 Node node=ll.remove();
                
                }

            }

        }
        public void put(K key,V value){
            int bi=hashfunction(key);
            int di=SearchInLL(key,bi);
            if(di!=-1){
               Node node= buckets[bi].get(di);
               node.value=value;
            }
            else{
                buckets[bi].add(new Node(key,value));
                   n++;
            }
            double lamda=(double)n/N;
            if(lamda>2.0){
                rehash();
            }
    
        }
        public boolean containsKey(K key,V value){
            return false;
        }

    }
    public static void main(String[] args) {
         
    }
}
