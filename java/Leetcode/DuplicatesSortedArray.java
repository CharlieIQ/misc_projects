public class DuplicatesSortedArray {
    public static void main(String[] args){
        // BROKEN
        int[] testNums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(testNums));
    }

    public static int removeDuplicates(int[] nums){
        int[] nonDuplicateNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            if (i + 1 < nums.length){
                if (nums[i] == nums[i+1]) {
                    nonDuplicateNums[i] = nums[i];
                    nums[i] = -111;
                }
            }


        }

        return nonDuplicateNums.length;
    }

}
