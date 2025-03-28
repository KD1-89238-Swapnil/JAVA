public class DateTest {
    public static void main(String[] args) {
        Date myDate = new Date(9, 21, 2024);
        System.out.print("Initial Date: ");
        myDate.displayDate();
        myDate.setMonth(10);
        myDate.setDay(5);
        myDate.setYear(2025);
        System.out.print("Modified Date: ");
        myDate.displayDate();
    }
}
