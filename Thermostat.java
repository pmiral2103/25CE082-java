public class Thermostat {
    
    private String location;
    private int temperature;

    private static final int MIN=16;
    private static final int MAX=30;
    private static int activecount=0;

    Thermostat(String location,int starttemp)
    {
        this.location=location;
        if(starttemp>=MIN && starttemp<=MAX)
        {
         temperature=starttemp;
        }
        else{
            temperature=22;
        }
        activecount++;
    }

    Thermostat(String location)
    {
        this(location,22);
    }

     void raise() {
        if (temperature < MAX)
            temperature++;
        else
            System.out.println("Already at maximum");
    }

     void lower() {
        if (temperature > MIN)
            temperature--;
        else
            System.out.println("Already at minimum");
    }

     int getTemperature() {
        return temperature;
    }

     static int getActiveCount() {
        return activecount;
    }

    public static void main(String[] args) {
        Thermostat t1=new Thermostat("room",22);
        Thermostat t2=new Thermostat("Hall");

        for(int i=1;i<=10;i++)
        {
            t1.raise();
            System.out.println(t1.getTemperature());
        }

        for(int i=1;i<=20;i++)
        {
            t2.lower();
            System.out.println(t2.getTemperature());
        }

          System.out.println("Active Count = " + Thermostat.getActiveCount());
    }
}
