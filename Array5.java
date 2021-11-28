import java.util.Scanner;

public class Array5 {
    public static void main(String [] agrs){
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
        int sum=0;
        if(max<min){
            for(int i=max;i<min;i++){
                if(i!=max && i!=min) {
                    sum += array[i];
                }
            }
        }else{
            for (int i=min;i<max;i++){
                if(i!=max && i!=min) {
                    sum += array[i];
                }
            }
        }
        System.out.println(sum);
    }
}
