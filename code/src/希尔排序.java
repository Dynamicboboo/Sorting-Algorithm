/**
 * @Description ：
 * @Author tj
 * @Date 2020/10/5
 */
public class 希尔排序 {
    public static void main(String[] args) {
        int[] nums = {2,4,5,2,78,9,7,78,99,56};
        ShellSort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
    public static int[] ShellSort(int[] array) {
        if (array.length == 0)
            return array;
        int len = array.length;
        int gap = len / 2;
        while (gap > 0){
            for (int i = gap; i < len; i++) {
                int preIndex = i - gap;
                int temp = array[i];
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp; // preIndex + gap 关注while中的preIndex -= gap;
            }
            gap /= 2;
        }
       return array;
    }
}
