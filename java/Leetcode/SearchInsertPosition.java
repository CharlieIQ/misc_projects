public class SearchInsertPosition {
    public static void main(String[] args){
        int[] test1 = {1, 3, 5, 6};
        System.out.println(searchInsert(test1, 5));
    }
    // Method has to be O(log(n))
    // nums is SORTED
    //
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        int range = nums.length - 1;

        while (i <= range){
            int middlePoint = i + (range - 1)/2;
            if (nums[middlePoint] == target){
                return middlePoint;
            }

            if (nums[middlePoint] < target){
                i = middlePoint + 1;
            }
            else {
                i = middlePoint - 1;
            }
        }

        return nums.length;
    }
}
