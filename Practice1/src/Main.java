public class Main{
    public static void main(String[] args){
        for (int i = 1; i < 11; i++){
           double x = 1.0/i;
           String sized = String.format("%.3f",x);
           System.out.println(sized);
        }
    }
}