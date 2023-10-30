
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int x;

        for(int i = 0; i < arr.length; i++){
            x = 0;
            for(int j = 2; j <= arr[i]/2; j++ ){

                if (arr[i] % j == 0){
                    x=1;
                }
            }
            if(x == 0)
                System.out.println("\nnumarul "+arr[i]+" este prim!");*/
        String cuvant;
        String rez;
        System.out.println("Introduceti un cuvant: ");
        cuvant = scanner.nextLine();
        rez = retMijloc(cuvant);
        System.out.printf("mijlocul cuvantului %s este %s",cuvant,rez);
        }
    public static String retMijloc(String a){

        StringBuilder builder = new StringBuilder();

        if( a.length() % 2 == 0){

            builder.append(a.charAt(a.length()/2-1));
            builder.append(a.charAt(a.length()/2));

        } else {

            builder.append(a.charAt(a.length() / 2));
        }
        return builder.toString();
    }

}
