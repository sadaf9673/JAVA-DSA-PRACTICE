import java.util.Scanner;
public class RemoveDuplicate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(a[i] == a[j]){
                        for(int k=j; k<size-1; k++){
                            a[k] = a[k+1];
                        }
                        size--;
                        j--;
                    
                }
            }
        }
        System.out.println("Array after removing duplication: ");
        for(int i=0; i<size; i++){
            System.out.print(a[i]+" ");
        }
    }
}