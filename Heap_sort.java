public class Heap_sort {

public static void heapify(int arr[],int i,int n){
int left=2*i+1;
int right=2*i+2;
int maxidx=i;
if(left<n && arr[left]>arr[maxidx]){
    maxidx=left;}
    if(right<n && arr[right]>arr[maxidx]){
        maxidx=right;
    }
if(i!=maxidx){
int temp=arr[i];
arr[i]=arr[maxidx];
arr[maxidx]=temp;
heapify(arr, maxidx, n);
}
}
    public static void heapsort(int arr[]){
//step1->Build maxheap
int n=arr.length;
for(int i=n/2;i>=0;i--){
    heapify(arr,i,n);
}
//step1-> To swap the larger element to last index
for(int i=n-1;i>0;i--){
    int temp=arr[0];
    arr[0]=arr[i];
    arr[i]=temp;
    heapify(arr,0,i);
}
    }
 public static void main(String[] args) {
    int arr[]={1,2,3,5,4};
    heapsort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
 }   
}
