package function;

public class DayOfWeek {

    public static void main(String[] args) {

        int month = Integer.valueOf(args[0]);

        int year = Integer.valueOf(args[2]);

        String[] months = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        int[] day ={ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] weekDays = { "sun","mon","tue","wen","thur","fri","sat"};
        if (month == 2 && isLeapYear(year)) day[month] = 29;

        System.out.println("   " + months[month] + " " + year);

        int d = day(month, 1, year);

        // print the calendar
        for (int i = 0; i < d; i++)
            System.out.println(" ");
        for (int i = 1; i <= day[month]; i++) {
            System.out.println(i);
            if (((i + d) % 7 == 0) || (i == day[month])) {
                System.out.println();
            }
        }


    }

        public static int day(int month, int day, int year) {
            int y = year - (14 - month) / 12;
            int x = y + y/4 - y/100 + y/400;
            int m = month + 12 * ((14 - month) / 12) - 2;
            int d = (day + x + (31*m)/12) % 7;
            return d;
        }
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) return true;
        return false;

    }
}