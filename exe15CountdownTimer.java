// JAVA COUNT-DOWN TIMER program

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class exe15CountdownTimer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;        // decrement count by 1.
                if(count < 0){
                    System.out.println("Happy New Year!🎆");
                    timer.cancel();     // to stop the timer.
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); //(task, delay, period(between executions)).

        scanner.close();

    }
}
