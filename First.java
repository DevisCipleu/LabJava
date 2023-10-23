
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int x;

        for(int i = 0; i < arr.length; i++){
            x = 0;
            for(int j = 2; j <= arr[i]/2; j++ ){

                if (arr[i] % j == 0){
                    x=1;
                }
            }
            if(x == 0)
                System.out.println("\nnumarul "+arr[i]+" este prim!");
        }
    }
}
