package logik;

public class Person {
    private String fullName;
    private String position;
    private String eMail;
    private String tel;
    private int salary;
    private int age;

    public Person() {
    }

    public Person(String fullName, String position, String eMail, String tel, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void outToConsole(){
        StringBuffer sb = new StringBuffer("Сотрудник: ");
        sb.append(this.fullName);
        sb.append("\n Должность: ");
        sb.append(this.position);
        sb.append("\n Электронная почта:");
        sb.append(this.eMail);
        sb.append("\n Телефон: ");
        sb.append(this.tel);
        sb.append("\n Зарплата: ");
        sb.append(this.salary);
        sb.append(" $");
        sb.append("\n Возраст: ");
        sb.append(this.age);

        System.out.println(sb);
    }
}

