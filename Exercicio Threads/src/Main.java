public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        Thread thread3 = new Thread3();

        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}