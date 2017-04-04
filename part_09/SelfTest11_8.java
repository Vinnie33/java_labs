package part_09;

/**
 * Change Tick Tock class (aka renamed to "SelfTest11_8") so it actually keeps time and waits 1/2 second.
 */

public class SelfTest11_8 {

        String state;

        synchronized void tick(boolean running) {
            if(!running) {
                state = "ticked";
                notify();
                return;
            }

            System.out.print("Tick ");

            try {
                Thread.sleep(500);
            }   catch (InterruptedException exc) {
                System.out.println("Thread interrupted");
            }

            state = "ticked";

            notify();
            try {
                while(!state.equals("tocked"))
                    wait();
            }
            catch(InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }

        synchronized void tock(boolean running) {
            if(!running) {
                state = "tocked";
                notify();
                return;
            }

            System.out.println("Tock");

            try {
                Thread.sleep(500);
            }   catch (InterruptedException exc) {
                System.out.println("Thread interrupted");
            }

            state = "tocked";

            notify();
            try {
                while(!state.equals("ticked"))
                    wait();
            }
            catch(InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
    }

class MyThread8 implements Runnable {
    Thread thrd;
    SelfTest11_8 ttOb;

    // Construct a new thread.
    MyThread8(String name, SelfTest11_8 tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {

        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i=0; i<5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for(int i=0; i<5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String args[]) {
        SelfTest11_8 tt = new SelfTest11_8();
        MyThread8 mt1 = new MyThread8("Tick", tt);
        MyThread8 mt2 = new MyThread8("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}