import java.util.*;
public class Heap_01 {

    static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int p=(arr.size()-2)/2;
            int x=arr.size()-1;
            while(arr.get(x)<arr.get(p)){
                int temp=arr.get(p);
                arr.set(p,arr.get(arr.size()-1));
                arr.set(arr.size()-1,temp);
                x=p;
                p=(x-1)/2;
            }

        }
        public int peek(){
            return arr.get(0);
        }


        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr.size() && arr.get(minidx) > arr.get(left)){
                minidx=left;
            }
            if(right<arr.size() && arr.get(minidx)>arr.get(right)){
                minidx=right;
            }
            if(minidx != i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);
                heapify(minidx);
            }

        }
        public int remove(){
            int data=arr.get(0);
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;

        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap obj1=new Heap();
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);
        obj1.add(6);
        
        while(!obj1.isEmpty()){
            System.out.println(obj1.peek());
            obj1.remove();
        }
    }
}
