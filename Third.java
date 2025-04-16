package DSA_practice;
public class Third {
    public static void main(String[] args) {
        int[] arr ={5,2,7,9,6};
        int n = arr.length;
        int i =0;
        int j =n-1;
         while (i<j) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
         j--;
         if (i>=j){
             break;
         }
         }
         for (int x=0; x<arr.length; x++)  {System.out.println(arr[x]);}

         }
         }

