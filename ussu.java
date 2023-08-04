import java.util.Scanner;

public class ussu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,k;
        System.out.print("üssü alınacak sayıyı girin: ");
        n = input.nextInt();
        System.out.print("sayının üssünü girin: ");
        k = input.nextInt();
        int total =1;

        for(int i=1;i<=k;i++){
            total *=n;
        }
        System.out.println("sonuç: "+total);


    }
    
}
