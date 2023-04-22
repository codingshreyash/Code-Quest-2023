import java.util.*;
public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();

        for (int i = 0; i < numTestCases; i++) {
            int numPairs = scanner.nextInt();
            Map<String, Set<String>> ipToMacMap = new TreeMap<>();
            for (int j = 0; j < numPairs; j++) {
                String ipAddress = scanner.next();
                String macAddress = scanner.next();

                Set<String> macAddresses = ipToMacMap.getOrDefault(ipAddress, new HashSet<>());
                macAddresses.add(macAddress);
                ipToMacMap.put(ipAddress, macAddresses);
            }
            for (String ipAddress : ipToMacMap.keySet()) {
                Set<String> macAddresses = ipToMacMap.get(ipAddress);
                System.out.println(ipAddress + " " + macAddresses.size());
            }
        }
        scanner.close();
    }
} 
