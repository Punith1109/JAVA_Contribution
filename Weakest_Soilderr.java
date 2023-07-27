import java.util.PriorityQueue;

public class Weakest_Soilderr {
    static class Row implements Comparable<Row> {
        int soilders;
        int idx;
        Row(int soilders,int idx){
            this.soilders=soilders;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soilders==r2.soilders){
                return this.idx-r2.idx;
            }
            else{
            return this.soilders-r2.soilders;}
        }
    }
    public static void main(String[] args) {
        int n=4,m=4,k=3;
        int matrix[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int soilders=0;
            for(int j=0;j<m;j++){
                soilders=soilders+matrix[i][j];
            }
            pq.add(new Row(soilders,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}
