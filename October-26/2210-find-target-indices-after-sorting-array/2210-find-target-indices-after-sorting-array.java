class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {
        int num1 = 0; 
        int num2 = 0; 

        for (int num : nums) {
            if (num < target) {
                num1++;
            } else if (num == target) {
                num2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = num1; i < num1 + num2; i++) {
            res.add(i);
        }
        return res;
    }
}