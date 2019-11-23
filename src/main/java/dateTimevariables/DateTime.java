package dateTimevariables;

import java.time.*;
import java.time.temporal.Temporal;

public class DateTime {
     public static void getTimeMethods(){
         //czas aktualny


         LocalTime actual = LocalTime.now();

         LocalTime custom = LocalTime.of(10,10,10);
         System.out.println(actual);
         System.out.println(custom);

         LocalTime parsed = LocalTime.parse("12:13:21");
         System.out.println(parsed);


         System.out.println(parsed.getHour() + " : " + parsed.getMinute());

            Duration duration = Duration.between(actual,custom);
         System.out.println(duration);



     }


     public static void getDate(){
         LocalDate actualDate = LocalDate.now();
         LocalDate customDate = LocalDate.of(2000,5,11);
         System.out.println(actualDate);
         System.out.println(customDate);

        Period period =  Period.between(customDate,actualDate); // różnica arg2 - arg1
         System.out.println(period.getYears());
         System.out.println(period.getMonths());
         System.out.println(period.getDays());

     }

        public static void getDateTime(){
            LocalDateTime actual = LocalDateTime.now();
            LocalDateTime custom = LocalDateTime.of(2000,12,10,12,12,12);
            System.out.println(actual);
            System.out.println(custom);

        }



    public static void main(String[] args) {
        getDateTime();
    }
}
