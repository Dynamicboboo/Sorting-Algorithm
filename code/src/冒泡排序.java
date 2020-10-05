/**
 * @Description ：
 * @Author tj
 * @Date 2020/10/5
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] nums = {2,4,5,2,78,9,7,78,99,56};
        BubbleSort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
    public static int[] BubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
