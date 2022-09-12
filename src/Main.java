import java.util.Random;
public class Main {
    public static void main(String[] args) {
        task4();
    }
    private static void task1(){
        Random random = new Random();
        int[] a = new int[random.nextInt(6) + 5];
        int sum = 0;
        for (int n : a){
            n = random.nextInt(100);
            sum += n;
            System.out.println(n);
        }
        System.out.printf("sum: %d%navg: %f",sum, (double) sum / a.length);
    }
    private static void task2(){
        Random random = new Random();
        int[] a = new int[random.nextInt(6) + 5];
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        char i = 0;
        while(i < a.length){
            a[i] = random.nextInt(100) - 50;
            sum += a[i];
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]);
            System.out.println(a[i]);
            i++;
        }
        System.out.printf("sum: %d%nmin: %d%nmax: %d",sum,min,max);
    }
    private static void task3(String[] a){
        for (String s: a)
            System.out.println(s);
    }
    private static void task4(){
        for (byte i = 1; i < 10; i++)
            System.out.printf("%f, ",1/((double)i));
        System.out.println(1/10.0);
    }

    public static int task5(int f){
        int result = 1;
        for (int i = 1; i <= f; i++)
            result *= i;
        return result;
    }
}
