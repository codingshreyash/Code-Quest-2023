
import java.util.*;

public class Problem7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numTestCases; i++) {
            double x = Double.parseDouble(scanner.nextLine());
            double z = x;
            double total = 0;
            for (int j = 0; j<x;j++){
                String [] arr = (scanner.nextLine()).split(" ");

                if (arr[0].equals("LOW")){
                    total += 1*Double.parseDouble(arr[1]);
                }

                if (arr[0].equals("MEDIUM")){
                    total += 2*Double.parseDouble(arr[1]);
                    z++;
                }

                if (arr[0].equals("HIGH")){
                    total += 3*Double.parseDouble(arr[1]);
                    z+=2;
                }

            }
            
            double avg = total/z;
            avg = 10*avg;
            int y = (int) Math.round(avg);
            System.out.println(y);
        }
        scanner.close();
    }
    
}
