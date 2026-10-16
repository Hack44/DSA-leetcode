import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            func(strs[i], map);
        }
        return new ArrayList<>(map.values());
    }
    public void func(String str, HashMap<String,List<String>> map){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        if (!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(str);
    }
}