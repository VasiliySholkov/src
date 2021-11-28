import java.util.Scanner;

public class Array2 {
    public static void main (String [] agrs){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }

        int min =0;
        int max =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
            else  if (array[i] < array[min]) {
                min = i;
            }

        }

        int tmp = array[min];
        array[min] = array[max];
        array[max] = tmp;

    for(int i=0;i<n;i++){
        System.out.print(array[i]+" ");
    }
    }
}
