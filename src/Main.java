import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= T; i++) {
            long N = in.nextLong();

            while (true){
                int j;
                long n = N;
                for (j = 1; j < String.valueOf(N).length(); j++){
                    long temp = n % 10;
                    n = n/10;
                    if (temp < n % 10){
                        //violation happened
                        break;
                    }
                }
                if (j == String.valueOf(N).length()){
                    break;
                }
                else{
                    N = n * (long)Math.pow(10, j) - 1;
                }
            }

            System.out.println("Case #" + i + ": " + N);
        }
    }
}
