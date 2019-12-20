package stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public long start() {

        this.startTime = System.currentTimeMillis();
        return this.startTime;

    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime() {
        long elapsed;

        return elapsed = this.endTime - this.startTime;
    }
    public long getElapsedTimeSecs() {


        return (this.endTime - this.startTime)/1000;
    }

    @Override
    public String toString() {
        return "Elapsed Time" + getElapsedTime();
    }
}

