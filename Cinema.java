public class Cinema {
    
    private String title;
    private int seatsAvailable;
    private final int capacity;
    private static int totalBooked = 0;

    Cinema(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        seatsAvailable = capacity;
    }

    Cinema(String title) {
        this(title, 100);
    }

    boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable -= n;
            totalBooked += n;
            return true;
        }
        return false;
    }

     void cancel(int n) {
        seatsAvailable += n;

        if (seatsAvailable > capacity)
            seatsAvailable = capacity;
    }

      int getSeatsAvailable() {
        return seatsAvailable;
    }

    static int getTotalBooked() {
        return totalBooked;
    }

     public static void main(String[] args) {
        Cinema c=new Cinema("Spiderman",100);
        
        System.out.println(c.book(30));
        System.out.println("seats: "+c.getSeatsAvailable());

        System.out.println(c.book(90));
        System.out.println("seats: "+c.getSeatsAvailable());

        c.cancel(20);
        System.out.println("seats: "+c.getSeatsAvailable());

        System.out.println(c.book(10));
        System.out.println("seats: "+c.getSeatsAvailable());

        System.out.println("total: "+Cinema.getTotalBooked());
     }
}
