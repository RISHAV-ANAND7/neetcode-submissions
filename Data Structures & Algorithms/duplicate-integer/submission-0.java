class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        if(set.size()!=nums.length){
            return true;
        }
        return false;
    }
}