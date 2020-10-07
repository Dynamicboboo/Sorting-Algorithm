/**
 * @Description ：
 * @Author tj
 * @Date 2020/10/5
 */
public class 快速排序 {
    public static void main(String[] args) {
        int[] nums = {2,4,5,2,78,9,7,78,99,56 };
        QuickSort(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
    public static void QuickSort(int[] array , int l , int r) {
       if (l>r)
           return;
       int left = l , right = r;
       int pivot  = array[ left];
       while (left <right){
           while (left<right && array[right] >= pivot){
               right--;
           }
           if (left<right){
               array[left] =array[right];
           }
           while (left < right && array[left] <= pivot){
               left++;
           }
           if (left<right){
               array[right] = array[left];
           }
           if (left == right){
               array[left] = pivot;
           }
       }
       QuickSort(array,l,right-1);//对已经分到左边的（小于基准得） 用递归  再一次
       QuickSort(array,right+1,r);
    }

}
