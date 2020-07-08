package common.sort;

public class QuickSort {
    public static void quickSort(int[] nums, int start, int end){
        //终止条件
        if (start >= end) return;
        int partition = partition(nums, start, end);
        quickSort(nums, start, partition-1);
        quickSort(nums, partition+1, end);
    }

    /**
     * 分区函数
     * @return
     */
    private static int partition(int[] num, int start, int end){
        int pivot = num[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if (num[i]<=pivot){
                swap(num, i, index);
                index++;
            }
        }
        swap(num, index, end);
        return index;
    }

    private static void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
