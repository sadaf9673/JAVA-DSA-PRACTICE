//Code for Rotating array elements 
import java.util.Scanner;
public class RotateKtimes{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    int[] arr = new int[size];

    for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();

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
