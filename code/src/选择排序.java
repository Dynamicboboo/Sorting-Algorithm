/**
 * @Description ：
 * @Author tj
 * @Date 2020/10/5
 */
public class 选择排序 {
    public static void main(String[] args) {
        int[] nums = {2,4,5,2,78,9,7,78,99,56,1};
        SelectSort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
    public static int[] SelectSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
