public class CombinedTable
{
    private SingleTable t1, t2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public boolean canSeat(int n) {
        return t1.getNumSeats() + t2.getNumSeats() - 2 >= n;
    }

    public double getDesireablity() {
        double d1 = t1.getViewQuality();
        double d2 = t2.getViewQuality();
        double h1 = t1.getHeight();
        double h2 = t2.getHeight();

        double avg = (d1 + d2) / 2;

        if (h1 != h2) {
            return avg - 10.0;
        }
        else {
            return avg;
        }
    }
}
