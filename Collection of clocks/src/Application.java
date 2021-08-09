import java.util.*;
import java.lang.*;
import java.time.*;

class Application{
    public static void main(String[] args) {
        Clock clock1 = new Clock(11,59);
        Clock clock2 = new Clock(22,14);
        Clock clock3 = new Clock(8,45);
        Clock clock4 = new Clock(1,50);
        Clock clock5 = new Clock(4,21);

        List<Clock> clock = new LinkedList<>();

        clock.add(clock1);
        clock.add(clock2);
        clock.add(clock3);
        clock.add(clock4);
        clock.add(clock5);

        for(int i=0;i<clock.size();i++){
            clock.get(i).addMinute();
        }
    }
}

class Clock {
    LocalTime time;

    public Clock(int hour, int minute) {
        this.time = LocalTime.of(hour, minute);
    }

    public void addMinute() {

            time = time.plusMinutes(1);
            System.out.println(time);

    }
}