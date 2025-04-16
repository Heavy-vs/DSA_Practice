package DSA_practice;
public class Fifth {
    public static void main(String[] args) {
        public static void transpose(int[][]arr){
            for (int i = 0; i< arr.length; i++){
                for (int j =0 ; j<i;j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            int x = 0;
            int y = arr.length-1;
            while (x<j){
                int temp = arr[x];
                arr[x] =arr[y];
                arr[y]= temp;
                x++;
                j--;
                if (x>=y){
                    break;
                }
            }
            for (int i = 0; i< arr.length; i++){
                for (int j =0 ; j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}