package Bai2_4;
class MyDate {
    private int day, month, year;
    public MyDate(int day, int month, int year) {
        this.day = day; this.month = month; this.year = year;
    }
    public MyDate(MyDate other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }
    public void setDate(int day, int month, int year) {
        this.day = day; this.month = month; this.year = year;
    }
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
class Employee {
    private String name;
    private MyDate birthday;
    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = new MyDate(birthday);
    }
    public Employee(Employee other) {
        this.name = other.name;
        this.birthday = new MyDate(other.birthday);
    }
    public MyDate getBirthday() { return birthday; }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", new MyDate(1, 1, 2000));
        Employee emp2 = new Employee(emp1); // Deep copy
        emp1.getBirthday().setDate(2, 2, 2022);
        System.out.println("Ngày sinh emp2: " + emp2.getBirthday());
    }
}
