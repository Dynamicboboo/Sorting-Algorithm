/**
 * @Description ：
 * @Author tj
 * @Date 2020/10/5
 */
public class 插入排序 {
    public static void main(String[] args) {
        int[] nums = {2,4,5,2,78,9,7,78,99,56};
        InsertionSort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
    public static int[] InsertionSort(int[] array) {
        if (array.length == 0)
            return array;
        int next;//需要比较的排排序值
        for (int i = 0; i < array.length - 1; i++) {
            next =array[i+1];//当前需排序的值
            int preIndex = i;//被比较的已排序值
            while (preIndex>=0 && next<array[preIndex]){
                array[preIndex+1] = array[preIndex];
                preIndex--;//继续向前比较
            }
            array[i+1] = next;
        }
        return array;
    }
}
