public class Animal {

    int age;
    String gender;
    double weightInKg;

    public Animal(int age, String gender, double weightInKg) {
        this.age = age;
        this.gender = gender;
        this.weightInKg = weightInKg;
    }

    public void eat() {
        System.out.println("Animals Eating ...");
    }

    public void sleep() {
        System.out.println("Animals Sleeping ...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }
}
