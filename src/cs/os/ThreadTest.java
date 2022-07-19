package cs.os;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadWithClass thread1 = new ThreadWithClass();    // Thread 클래스를 상속받는 방법
        Thread thread2 = new Thread(new ThreadWithInterface());     // Runnable 인터페이스를 구현하는 방법
        Thread thread3 = new Thread(new ThreadWithInterface());

        thread3.setPriority(10);        // Thread-2의 우선순위를 10으로 변경

        thread1.start();        // 스레드1 실행
        thread2.start();        // 스레드2 실행
        thread3.start();        // 스레드3 실행

        System.out.println(thread2.getPriority());
        System.out.println(thread3.getPriority());
    }
}
