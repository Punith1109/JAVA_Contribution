import java.util.*;
public class Hash_Map01 {
    public static void main(String[] args) {
      HashMap<String, Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",123);
        hm.put("us",39);
    //     System.out.println(hm);
    //    int a= hm.get("India");
    //    System.out.println(a);
    //    System.out.println(hm.containsKey("dd"));
    //    System.out.println(hm.remove("China"));
    Set<String>keys=hm.keySet();
    System.out.println(keys);
    for (String k : keys) {
        System.out.println("Key "+k+" value is="+ hm.get(k));
    }
    }
}
