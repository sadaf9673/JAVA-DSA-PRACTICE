import java.util.Scanner;
public class ArrayRotation {

    public static void Reverse(int[] arr, int start, int end){

        while(start < end){

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            end--;
            start++;
        }
    }
    public static void main(String[] args) {
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
        k= k%size;
        //Reverse array
        Reverse(arr, 0, size-1);

        //Reverse first k elements
        Reverse(arr, 0, k-1);

        //Reverse remaining element
        Reverse(arr, k, size-1);

        System.out.println("Rotated Array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
