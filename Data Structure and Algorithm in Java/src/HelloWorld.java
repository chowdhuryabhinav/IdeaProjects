
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;

public class HelloWorld {

    public static void main(String[] args) throws ParseException {
        System.out.println("Hello World");
        //Test
        System.out.println(System.currentTimeMillis());

        Date date = new Date();

        Timestamp currentTimestamp = new Timestamp(date.getTime());

        System.out.println(currentTimestamp.getTime());

//        String[] time = currentTimestamp.split(" ");
//
//        String[] formattedTime = time[1].split(".");
//        System.out.println(time[1]);

        String marketClosedTime = "21:07:02";

        SimpleDateFormat formatter3 = new SimpleDateFormat("HH:mm:ss");


        SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
        Date date2 = new Date();
        String currentDate = formatter2.format(date2).toString();
        System.out.println("---------->" + currentDate);

        Date date4 = formatter2.parse(currentDate);


        Date date3 = formatter3.parse(marketClosedTime);

        // Calculating the difference in milliseconds
        long differenceInMilliSeconds
                = Math.abs(date3.getTime() - date4.getTime());

        // Calculating the difference in Hours
        long differenceInHours
                = (differenceInMilliSeconds / (60 * 60 * 1000))
                % 24;

        // Calculating the difference in Minutes
        long differenceInMinutes
                = (differenceInMilliSeconds / (60 * 1000)) % 60;

        // Calculating the difference in Seconds
        long differenceInSeconds
                = (differenceInMilliSeconds / 1000) % 60;

        // Printing the answer
        System.out.println(
                "Difference is " + differenceInHours + " hours "
                        + differenceInMinutes + " minutes "
                        + differenceInSeconds + " Seconds. ");

        System.out.println(date3.after(date4));


//        Calendar cal = Calendar.getInstance();
//        Formatter formatter = new Formatter();
//
//        formatter.format("%tl:%tM:%tS", cal, cal,cal);
//
//        System.out.println(formatter.toString());

        SimpleDateFormat format5 = new SimpleDateFormat("HH:mm:ss");
        format5.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date currentGMTTime = new Date();

        String formattedGMT = format5.format(currentGMTTime).toString();

        System.out.println("Formatted GMT Time" + formattedGMT);

    }
}
