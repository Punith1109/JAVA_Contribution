import java.util.*;
public class Preority_Queue {

    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>( );
  pq.add(new Student("p",30));
  pq.add(new Student("k",10));
   pq.add(new Student("l",31));
  pq.add(new Student("tgb",60));

    while(!pq.isEmpty()){
System.out.println(pq.peek().name+"->"+ pq.peek().rank);
pq.remove();
    }
    
    }
}
