import java.util.*;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        for (int i = 0; i < numTestCases; i++) {
            int numDataLines = scanner.nextInt();
            int numTemplateLines = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            Map<String, String> dataMap = new HashMap<>();
            for (int j = 0; j < numDataLines; j++) {
                String dataLine = scanner.nextLine();
                String[] parts = dataLine.split(": ");
                dataMap.put(parts[0], parts[1]);
            }
            
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < numTemplateLines; j++) {
                String templateLine = scanner.nextLine();
                String[] parts = templateLine.split("\\[|\\]");
                for (int k = 0; k < parts.length; k++) {
                    if (k % 2 == 0) {
                        output.append(parts[k]);
                    } else {
                        String key = parts[k].trim();
                        String value = dataMap.get(key);
                        output.append(value);
                    }
                }
                if (j != numTemplateLines-1)
                    output.append("\n");
            }
            
            System.out.println(output);
        }
        
        scanner.close();
    }
}
