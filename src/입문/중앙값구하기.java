package 입문;

import java.util.Arrays;
import java.util.Random;

public class 중앙값구하기 {
    //중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    // 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
    // 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[] array) {
        int count;
        if (array.length %2 ==0){
            count = array.length/2 + 1;
        }else {
            count = array.length/2 ;
        }
        array = Arrays.stream(array).sorted().toArray();
        int answer = array[count];
        return answer;
    }

    //중앙값만 찾는 퀵 셀렉트

    private static final Random random = new Random();

    public static int quickSelect(int[] nums, int left, int right, int k) {
        int pivot = partition(nums, left, right);
        if (pivot == k) return nums[pivot];
        return pivot > k ? quickSelect(nums, left, pivot - 1, k) : quickSelect(nums, pivot + 1, right, k);
    }

    private static int partition(int[] nums, int left, int right) {
        int pivotIdx = left + random.nextInt(right - left + 1);
        int pivotValue = nums[pivotIdx];
        swap(nums, pivotIdx, right);
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, i, storeIndex++);
            }
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int findMedian(int[] array) {
        int k = array.length / 2;
        return quickSelect(array, 0, array.length - 1, k);
    }


}
