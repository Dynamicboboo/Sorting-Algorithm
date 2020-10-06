import java.util.Arrays;

/**
 * @Description ：
 * @Author tj
 * @Date 2020/10/5
 */
public class 归并排序 {
    public static void main(String[] args) {
        int[] nums = {2,4,5,2,78,9,7,78,99,56};
        MergeSort(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
    public static void MergeSort(int[] array, int low, int high) {
        if (low >= high){
            return;
        }
        int mid = (low+high)>>>1;
        MergeSort(array,low,mid);
        MergeSort(array,mid+1,high);
        Merge(array,low,mid,high);//合并
    }
    public static  void Merge(int[] array,int low,int mid,int high){
        int s1 = low ;
        int s2 = mid+1;
        int[] ret = new int[high-low+1];
        int i=0;
        while (s1<=mid && s2 <=high){
            if (array[s1]<array[s2]){
                ret[i++] = array[s1++];
            }else{
                ret[i++] = array[s2++];
            }
        }
        while (s1<=mid){//若左边还有剩余 则左边继续添加
            ret[i++] = array[s1++];
        }
        while (s2<=high){
            ret[i++] = array[s2++];
        }
        for (int j = 0; j < ret.length; j++) {
            array[j+low] = ret[j];
        }
    }
}
