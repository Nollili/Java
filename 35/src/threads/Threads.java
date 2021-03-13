
package threads;

class SajatSzal extends Thread{
    SajatSzal(String nev){
        super(nev);
        start();
    }
    
    public void run(){
        for(int i = 0; i < 4; i++){
            System.out.println(Thread.currentThread().getName() + " szal fut...");
            try{
            Thread.sleep(1000);
            } catch(InterruptedException ex){
                System.out.println(Thread.currentThread().getName() + "szal leall...");
            }
        }
    }
}

public class Threads {

    public static void main(String[] args) {
       
        SajatSzal sSz1 = new SajatSzal("elso");
        SajatSzal sSz2 = new SajatSzal("masodik");
        SajatSzal sSz3 = new SajatSzal("harmadik");
        SajatSzal sSz4 = new SajatSzal("negyedik");
        
        for(int i = 0; i < 4; i++){
            System.out.println(Thread.currentThread().getName() + " szal fut...");
            try{
            Thread.sleep(1000);
            } catch(InterruptedException ex){
                System.out.println(Thread.currentThread().getName() + "szal leall...");
            }
        }
        
        sSz1.interrupt();
        sSz2.interrupt();
        sSz3.interrupt();
        sSz4.interrupt();
    }
    
}
