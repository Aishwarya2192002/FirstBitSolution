class Time {
    int hr, min, sec;

    Time(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
        normalize();
    }

    // Normalize time so sec < 60, min < 60, hr < 24
    void normalize() {
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
        if (hr >= 24) {
            hr = hr % 24;
        }
    }

    // 1️⃣ Add Two Time Objects
    void add(Time t) {
        System.out.println("\nAdding Two Time Objects:");

        int newHr = this.hr + t.hr;
        int newMin = this.min + t.min;
        int newSec = this.sec + t.sec;

        Time result = new Time(newHr, newMin, newSec);
        result.display();
    }

    // 2️⃣ Add Integer — add hours
    void add(int h) {
        System.out.println("\nAdding Hours:");
        Time result = new Time(this.hr + h, this.min, this.sec);
        result.display();
    }

    // 3️⃣ Add Integer — add minutes
    void addMinutes(int m) {
        System.out.println("\nAdding Minutes:");
        Time result = new Time(this.hr, this.min + m, this.sec);
        result.display();
    }

    // 4️⃣ Add Integer — add seconds
    void addSeconds(int s) {
        System.out.println("\nAdding Seconds:");
        Time result = new Time(this.hr, this.min, this.sec + s);
        result.display();
    }

    // Display in hh:mm:ss format
    void display() {
        System.out.printf("Time = %02d:%02d:%02d\n", hr, min, sec);
    }
}

// ------------ MAIN CLASS ----------------
public class TestTime {
    public static void main(String[] args) {

        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(5, 30, 30);

        t1.add(t2);        // Add two Time objects
        t1.add(3);         // Add hours
        t1.addMinutes(80); // Add minutes
        t1.addSeconds(100); // Add seconds
    }
}
