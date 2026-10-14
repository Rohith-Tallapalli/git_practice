class multithread extends Thread {
    public void run() {
        System.out.println("Thread is running");
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread 1");

        }
    }

    public static void main(String[] args) {
        multithread thread1 = new multithread();
        thread1.start();
        try {
            thread1.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}