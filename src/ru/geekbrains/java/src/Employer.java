public class Employer {
    String fio;
    String position;
    String e_mail;
    String phone;
    int wage;
    int age;

    public Employer(String fio, String position, String e_mail, String phone, int wage, int age) {
        this.fio=fio;
        this.position=position;
        this.e_mail=e_mail;
        this.phone=phone;
        this.wage=wage;
        this.age=age;
    }

    public void info (){
        System.out.println(this);
    }

    public String toString (){
        return fio+"\n=========================\nДолжность: "+position+"\nВозраст: "+age+"\nЗарплата: "+wage+
                "\nТел.: "+phone+"\ne-mail: "+e_mail+"\n=========================\n";
    }

    public String getFio() {
        return fio;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
