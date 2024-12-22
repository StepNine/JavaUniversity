import java.util.Scanner;

public class Second{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of massive");
        int size = scanner.nextInt();
        int[] mass = new int[size];
        System.out.println("Enter values");
        for (int i = 0; i < size; i++){
            mass[i] = scanner.nextInt();
        }

        int summ_do_while = 0;
        int i = 0;
        do{
            summ_do_while += mass[i];
            i++;
        } while(i < size);
        System.out.println("First sum: " + summ_do_while);

        int summ_while = 0;
        i = 0;
        while(i < size){
            summ_while += mass[i];
            i ++;
        }
        System.out.println("Second sum: " + summ_while);

        int max = mass[0];
        int min = mass[0];

        for ( i = 1; i < size; i++){
            if (mass[i] < min){
                min = mass[i];
            }
            if (mass[i] > max){
                max = mass[i];
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

    }
}