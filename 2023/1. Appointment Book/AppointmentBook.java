public class AppointmentBook {
    private boolean isMinuteFree(int period, int minute) {

    }

    private void reserveBlock(int period, int startMinute, int duration) {

    }

    public int findFreeBlock(int period, int duration) {
        int startMinute = 0;
        int lastPossibleMinute = 60 - duration;
        
        while (startMinute <= lastPossibleMinute) {
            int freeMinutes = 0;

            while (isMinuteFree(period, minute + freeMinutes)) {
                freeMinutes++;

                if (freeMinutes == duration) {
                    return minute;
                }
            }
            
            startMinute += freeMinutes + 1;
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
