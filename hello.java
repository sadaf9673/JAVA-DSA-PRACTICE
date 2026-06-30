import java.util.Scanner;
public class hello{

    public static void Reverse(int[] a, int start, int end){
        while(start<end){
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;

            end--;
            start++;
        }
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
         
      int size = sc.nextInt();
      int[] a = new int[size];
      for(int i=0;i<size;i++){
        a[i] = sc.nextInt();
      }
      int k = sc.nextInt();
      k=k%size;
      
      Reverse(a, 0, size-1);
      Reverse(a, 0, k-1);
      Reverse(a, k, size-1);

      for(int i=0;i<size;i++){
        System.out.print(a[i]+" ");
      }

    sc.close();
}
}