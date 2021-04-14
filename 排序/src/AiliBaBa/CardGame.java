package AiliBaBa;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CardGame {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] numbers = {3,2,4};
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();

        for(Map.Entry<Integer,Integer> entry : entries){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "->" + value);
        }
    }
}
