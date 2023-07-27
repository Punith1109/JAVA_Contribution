import java.util.*;
public class Anagram {


public static boolean isvalid(String s,String t){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }}
            for(int j=0;j<t.length();j++){
                char x=t.charAt(j);
                if(map.get(x)!=null){
                    if(map.get(x)==1){
                        map.remove(x);
                    }else{
                    map.put(x,map.get(x)-1);}
                }
                else{
                    return false;
                }
            }
            
         return map.isEmpty();}
    




 public static void main(String[] args) {
    String s="race";
    String t="care";
System.out.println(isvalid(s, t));
}
}