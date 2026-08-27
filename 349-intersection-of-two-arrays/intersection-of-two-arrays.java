import java.util.*;

class Solution { 
    int[] funt(int [] num1, int [] num2){
        Arrays.sort(num1);
        Arrays.sort(num2);

        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0; i<num1.length; i++){
            for(int j=0; j<num2.length; j++){
                
                if(num1[i] == num2[j]){
                    if(!output.contains(num1[i])){
                        output.add(num1[i]);
                    }
                    break;
                }
            }
        }
        int [] ans = new int[output.size()];
        for(int i=0; i< output.size(); i++){
             ans[i] = output.get(i);
        }
        return ans;
        
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        
        return funt(nums1, nums2);
    }
}