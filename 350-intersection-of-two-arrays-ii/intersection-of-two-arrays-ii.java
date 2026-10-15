class Solution {
    public int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int size = func(nums1, nums2, 0, 0, temp, 0);
        return Arrays.copyOf(temp, size);
    }
    public int func(int[] nums1, int[] nums2, int i, int j, int[] temp, int k){
        if (i >= nums1.length || j >= nums2.length){
            return k;
        }
        if (nums1[i] == nums2[j]){
            temp[k] = nums1[i];
            return func(nums1, nums2, i + 1, j + 1, temp, k + 1);
        }
        if (nums1[i] < nums2[j]){
            return func(nums1, nums2, i + 1, j, temp, k);
        }
        return func(nums1, nums2, i, j + 1, temp, k);
    }
}
