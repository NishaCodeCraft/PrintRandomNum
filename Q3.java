
import java.util.Random;

public class Q3 {
    public static void generateRandomNo(){
        Random rand = new Random();
        int randomNum = rand.nextInt(9000) + 1000;
        System.out.println("Random Number is: " + randomNum);
    }
    public static void main(String args[]){
       Q3 obj=new Q3();
       for(int i=1;i<=5;i++){
            obj.generateRandomNo();
       }
    }

}