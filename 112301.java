import java.util.Random;
import java.util.Scanner;

public class suiJi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int x = scanner.nextInt();
        Random rand = new Random();
        while(true){
            int x = scanner.nextInt();
            if(x==1){
                System.out.println("("+rand.nextInt(100)/10 + 1+","+rand.nextInt(10) + 1+")");
            }
            //System.out.println("("+rand.nextInt(100)/10 + 1+","+rand.nextInt(10) + 1+")");
            //break;
        }
    }
}
