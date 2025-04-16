package DSA_practice;
public class Fourth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int s = 0;
        int e = 0;
        for (s = 0 ; s< arr.length ; s++){
           for (e = 0; e<arr.length; e++){
               for (int k =s; k<=e; k++) {
                   System.out.print(arr[k]+" ");
               }
               System.out.println();
           }
        }
    }
}