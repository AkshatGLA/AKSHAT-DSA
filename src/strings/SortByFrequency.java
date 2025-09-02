package strings;

import java.util.*;

public class SortByFrequency {
    public static char helper(HashMap<Character,Integer> map,int freq){
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==freq){
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
                return entry.getKey();
            }
        }
        return 'c';
    }
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        Collections.sort(list,Collections.reverseOrder());
        String ans="";
        for(int i=0;i<list.size();i++){
            char ch=helper(map,list.get(i));
            while(map.get(ch)>0){
                ans+=ch;
                map.put(ch,map.get(ch)-1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));     // Output: "eert" or "eetr"
//        System.out.println(frequencySort("cccaaa"));  // Output: "cccaaa" or "aaaccc"
//        System.out.println(frequencySort("Aabb"));    // Output: "bbAa" or "bbaA"
    }
}
