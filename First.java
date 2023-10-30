
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
