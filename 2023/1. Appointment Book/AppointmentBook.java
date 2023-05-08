public class AppointmentBook {
    private boolean isMinuteFree(int period, int minute) {

    }

    private void reserveBlock(int period, int startMinute, int duration) {

    }

    public int findFreeBlock(int period, int duration) {
        int consectutiveFreeMinutes = 0;
        
        while (minute < 60) {
            if (isMinuteFree(period, minute)) {
                consectutiveFreeMinutes++;
                
                if (consectutiveFreeMinutes == duration) {
                    return minute - freeMinutes + 1;
                }
            }
            else {
               consectutiveFreeMinutes = 0; 
            }
            
            minute++;
        }

        return -1;
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        for (int period = startPeriod; period <= endPeriod; period++) {
            int startTime = findFreeBlock(periodToBook, duration);

            if (startTime != -1) {
                reserveBlock(period, startTime, duration);
                return true;
            }
        }

        return false;
    }
}
