public class Syncro {

    private boolean stepRequested = false;

    public synchronized void Waitstep() {
        stepRequested = false;
        while (!stepRequested) {
            try {
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Sorting interrupted");
            }
        }
    }
public synchronized void nextStep(){
        stepRequested = true;
        notifyAll();
    }


}
