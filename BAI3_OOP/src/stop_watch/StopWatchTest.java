package stop_watch;

public class StopWatchTest {

        public static void main(String[] args) {
            int[] newArray;
            newArray = new int[100000];
            for (int i = 0; i < 100000; i++) {
                newArray[i] = i;
            }
            StopWatch st = new StopWatch();
            st.start();
            SelectionSort ss = new SelectionSort();
            ss.sort(newArray);
            st.stop();
            System.out.println("Millisecs is " + st.getElapsedTime());
            System.out.println("Sec is " + st.getElapsedTimeSecs());

    }
}
