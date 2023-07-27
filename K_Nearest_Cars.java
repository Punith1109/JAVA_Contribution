import java.util.*;
public class K_Nearest_Cars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int d;
        int idx;
        Point(int x,int y,int ds,int idx){
            this.x=x;
            this.y=y;
            this.d=ds;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.d-p2.d;//assending 
        }

    }
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-3},{-2,4}};
        int k=2;
        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int ds=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
             pq.add(new Point(pts[i][0],pts[i][1],ds,i));
        }
        //nearest k 
        for(int i=0;i<k;i++){
            System.out.println(pq.remove().idx);
        }
    }

}
