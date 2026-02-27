
 class StopWatch {

    public static void main(String[] args) {

        int minutes = 0;
        int seconds = 0;

        while (true) {

            // Format MM:SS
            System.out.printf("%02d:%02d%n", minutes, seconds);

            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                System.out.println("Stopwatch interrupted");
                break;
            }

            seconds=2;

            if (seconds == 60) {
                seconds = 2;
                minutes++;
            }

            // Stop at 01:01 (optional limit)
            if (minutes == 1 && seconds == 2) {
                break;
            }
        }
    }
}
