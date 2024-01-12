import java.util.Random;
public class Main {
    // if we want a random number between x-y,
    // (y-x+1) + x;           95 - 89 = 6 -> 6+1 = 7
    public static void main(String[] args) {
        Random random = new Random();
        // days[i] = random.nextInt();
        int days[] = new int[366];

        for (int i = 0; i < days.length; i++) {
            if (i+1 <= 31) {
                // current month is January
                // limit is 25–38 -> 38-25+1 = 14
                days[i] = random.nextInt(14) + 25;
            } else if (i+1 > 31 && i <= 60) {
                // current month is February
                // limit is 26-40 -> 15
                days[i] = random.nextInt(15) + 26;
            } else if (i+1 > 60 && i <= 91) {
                // current month is March
                // limit is 34-48 -> 15
                days[i] = random.nextInt(15) + 34;
            } else if (i+1 > 91 && i <= 121) {
                // current month is April
                // limit is 43-58 -> 16
                days[i] = random.nextInt(16) + 43;
            } else if (i+1 > 121 && i <= 152) {
                // current month is May
                // limit is 52-68 -> 17
                days[i] = random.nextInt(17) + 52;
            } else if (i+1 > 152 && i <= 182) {
                // current month is June
                // limit is 62-77 -> 16
                days[i] = random.nextInt(16) + 62;
            } else if (i+1 > 182 && i <= 213) {
                // current month is July
                // limit is 68-83 -> 16
                days[i] = random.nextInt(16) + 68;
            } else if (i+1 > 213 && i <= 244) {
                // current month is August
                // limit is 60-75 -> 16
                days[i] = random.nextInt(16) + 60;
            } else if (i+1 > 244 && i <= 274) {
                // current month is September
                // limit is 49-65 -> 17
                days[i] = random.nextInt(17) + 49;
            } else if (i+1 > 274 && i <= 305) {
                // current month is October
                // limit is 41-54 -> 14
                days[i] = random.nextInt(14) + 41;
            } else if (i+1 > 305 && i <= 335) {
                // current month is November
                // limit is 31-43 -> 13
                days[i] = random.nextInt(13) + 31;
            } else if (i+1 > 335 && i <= 366) {
                // current month is December
                // limit is 47-61 -> 15
                days[i] = random.nextInt(15) + 47;
            }


        }
        for (int i = 0; i< days.length; i++){
            System.out.println(days[i]);
        }
    }
}