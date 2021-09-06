package homework.day09.Emp_file;

public class Sales extends Regular {
    double commition;

    public Sales(String name, String phone, String partition, String position, int pay, double commition) {
        super(name, phone, partition, position, pay);
        this.commition = commition;
    }

    @Override
    public int getPay() {
        int p = super.getPay();
        p = p + (int) (p * commition);
        return p;
    }

    public double getCommition() {
        return commition;
    }

    public void setCommition(double commition) {
        this.commition = commition;
    }

    @Override
    public String toString() {
        return super.toString() + ", 커미션 = " + commition;

    }
}
