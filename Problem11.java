import java.io.PrintStream;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = System.out;
           
        StringBuilder stringBuilder = new StringBuilder();

        int count = scanner.nextInt();
        scanner.nextLine();
        while (count-- > 0) 
        {
             scanner.nextLine();
             String data = scanner.nextLine().trim();
            char characters[] = data.toCharArray();
            for (int index = 0; index < data.length() - 3; index++) {
                String key = "" + characters[index + 2] + characters[index + 1] + characters[index];
                int position = data.indexOf(key, index);
                if (position > index) {
                    stringBuilder.setLength(0);
                    for (int k = index + 3; k < position; k++) {
                        stringBuilder.append(characters[k]);
                        if (key.contains("" + characters[k])) ++k;
                    }
                    if (stringBuilder.length() > 0) printStream.println(stringBuilder.toString());
                    index = position;
                }
            }
        }
        scanner.close();
    }
}
