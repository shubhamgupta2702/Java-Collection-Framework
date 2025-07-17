import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {

        int[] arr1d = {2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(arr1d));
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 3},
                {7, 8, 9}
        };



//        for (int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length;j++){
//                System.out.print(arr[i][j]+ ", ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
