package homework.day09.Emp_file;

public class PartTime extends Employee {
    public static final int timepay = 8500;
    int work_time, work_day;

    public PartTime(String name, String phone, String partition, String position, int work_time, int work_day) {
        super(name, phone, partition, position);
        this.work_time = work_time;
        this.work_day = work_day;
    }

    public int getPay() {
        return work_time * work_day * timepay;
    }

    public int getWork_time() {
        return work_time;
    }

    public int getWork_day() {
        return work_day;
    }

    public void setWork_time(int work_time) {
        this.work_time = work_time;
    }

    public void setWork_day(int work_day) {
        this.work_day = work_day;
    }

    @Override
    public String toString() {
        return super.toString() + ", 아르바이트 월급= " + getPay();
    }
}
