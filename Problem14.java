import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTests = scanner.nextInt();

        for (int i = 0; i < numTests; i++) {
            String dateStr = scanner.next();
            String timeStr = scanner.next();
            double offset = scanner.nextDouble();
            LocalDateTime localDateTime = LocalDateTime.parse(dateStr + " " + timeStr, DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));
            long hours = (long) offset;
            long minutes = Math.round((offset - hours) * 60);
            ZoneOffset utcOffset = ZoneOffset.ofHoursMinutes((int) hours, (int) minutes);
            LocalDateTime utcDateTime = localDateTime.atOffset(utcOffset).withOffsetSameInstant(ZoneOffset.UTC).toLocalDateTime();
            String outputStr = utcDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));
            System.out.println(outputStr);
        }
        scanner.close();
    }

}
