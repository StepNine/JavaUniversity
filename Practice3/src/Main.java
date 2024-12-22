import java.util.Random;
public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        int[] mas = new int[4];

        for (int i = 0; i < 4; i++){
            mas[i] = rand.nextInt(89) + 10;
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n");
        boolean boo = true;
        for (int i = 0; i < 3; i++){
            if (mas[i] > mas[i+1]){
                boo = false;
                break;
            }
        }

        if (boo == true){
            System.out.println("Строго возрастающая последовательность");
        } else{
            System.out.println("Не строго возрастающая последовательность");
        }
    }
}