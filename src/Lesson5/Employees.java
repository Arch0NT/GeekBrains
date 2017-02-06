package Lesson5;

public class Employees {
    private String fio;
    private String position;
    private String e_mail;
    private String phone;
    private int wages;
    private int age;

    public Employees (String fio, String position, String e_mail, String phone, int wages, int age){
        this.fio=fio;
        this.position=position;
        this.e_mail=e_mail;
        this.phone=phone;
        if (wages>0) this.wages=wages; // отрицательная ЗП - это рабство какое-то
        if (age>15) this.age=age; //до 16 детский труд запрещен :-)
    }

    public String toString (){
        return position+"\n"+fio+"\n-------------------------------------------------\nвозраст: "+age+
                "\nзарплата: "+wages+"\ne-mail: "+e_mail+"\nтелефон: "+phone+"\n";
    }

    public void printInfo (){
        System.out.println(toString());
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        if (wages>0) this.wages=wages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>15) this.age=age;
    }
}
