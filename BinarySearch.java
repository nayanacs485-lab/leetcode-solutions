public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 4;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                System.out.println("Target found at index " + mid);
                return;
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        System.out.println("Target not found");
    }
}

