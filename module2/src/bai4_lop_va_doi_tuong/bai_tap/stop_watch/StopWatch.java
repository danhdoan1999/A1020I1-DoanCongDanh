package bai4_lop_va_doi_tuong.bai_tap.stop_watch;

import java.time.LocalTime;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){

    }
    public StopWatch(long startTime,long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
         startTime = System.currentTimeMillis();
    }
    public void stop(){
         endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
