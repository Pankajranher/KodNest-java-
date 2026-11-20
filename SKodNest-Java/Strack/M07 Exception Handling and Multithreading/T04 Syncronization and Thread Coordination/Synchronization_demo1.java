class Hospital implements Runnable {

    String res1 = "Bed";
    String res2 = "Doctor";

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();

        if (threadName.equals("TOM")) {

            tomTreatment();
        } else {

            jerryTreatment();

        }

    }

    void tomTreatment() {

        try {

            synchronized (res1) { // Bed

                System.out.println("Tom has occupied " + res1);
                Thread.sleep(3000);
                synchronized (res2) // Doctor
                {
                    System.out.println("Tom has occupied " + res2);
                    Thread.sleep(3000);
                }
                System.out.println("Tom has released " + res2); // Doctor
            }
            System.out.println("Tom has released " + res1); // Bed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void jerryTreatment() {
        try {
            synchronized (res1) { // Bed
                System.out.println("Jerry has occupied" + res1);
                Thread.sleep(3000);
                synchronized (res2)// Doctor
                {
                    System.out.println("Jerry has occupied " + res2);
                    Thread.sleep(3000);
                }
                System.out.println("Jerry has released " + res2); // Doctor
            }
            System.out.println("Jerry has released " + res1); // Bed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Synchronization_demo1 {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h);
        t1.setName("TOM");
        t2.setName("JERRY");
        t1.start();
        t2.start();
    }
}