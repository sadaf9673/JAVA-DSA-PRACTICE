//Code for Rotating array elements 
import java.util.Scanner;
public class RotateKtimes{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of an array:");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter the elements of an array:");
    for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
    }

    System.out.print("Enter the value of K:");
    int k = sc.nextInt();

    // Handle the case k>size
    k = k%size;
    for(int p=0; p<k; p++){
        int temp = arr[size-1];

        for(int j=size-2; j>=0; j--){
            arr[j+1] = arr[j];
        }

        arr[0] = temp;
    }

    for(int i=0; i<size; i++){
        System.out.print(arr[i] + " ");
    }

    sc.close();
}
}
