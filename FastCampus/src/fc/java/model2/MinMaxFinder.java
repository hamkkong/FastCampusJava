package fc.java.model2;

public class MinMaxFinder {  //  함수를 구현해 사용자가 직접 API를 제작할 수 있다.
    private MinMaxFinder(){ }
    public static int findMin(int[] arr) {
        int min=arr[0]; //초기값
        for(int i=1; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
    public static int findMax(int[] arr) {
        int max = arr[0]; //초기값
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
