package homework.day09.bmi;

public class bmi {
    private String name, result;
    private int age;
    private double height, weight, bmi;

    public bmi(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

        calcBMI();
    }

    // setter, getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    // bmi 계산
    public void calcBMI() {
        bmi = weight / ((height / 100) * (height / 100));

        if (bmi >= 25.0) {
            result = "비만";
        } else if (bmi >= 23.0) {
            result = "과체중";
        } else if (bmi >= 18.5) {
            result = "정상";
        } else {
            result = "체중 부족";
        }
    }

    // 출력
    @Override
    public String toString() {
        return "[name = " + name + ", age = " + age + ", height = " + height + ", weight = " + weight + ", bmi = " + bmi
                + ", result = " + result + "]\n";
    }

}
