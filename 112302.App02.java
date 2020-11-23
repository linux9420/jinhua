import java.util.Random;

public class App02 {
    public static void main(String[] args) throws InterruptedException{

        Random rand = new Random();
        while(true){
            Thread.sleep(1000);
            System.out.println("("+rand.nextInt(10) + 1+","+rand.nextInt(10) + 1+")");
        }
    }
}
