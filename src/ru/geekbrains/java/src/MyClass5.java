public class MyClass5 {
    public static void main(String[] args) {
        Employer employers[] = new Employer[5];
        employers[0] = new Employer("Иванов Иван Иваныч", "директор", "ivanov.ivan@supercompany.ru", "+7 913 740 40 40", 300000, 42);
        employers[1] = new Employer("Иванова Инна Ивановна", "бухгалтер", "ivanova.inna@supercompany.ru", "+7 913 740 40 41", 100000, 22);
        employers[2] = new Employer("Иванов Альберт Ейнштейнович", "инженер", "ivanov.albert@supercompany.ru", "+7 913 740 40 43", 150000, 40);
        employers[3] = new Employer("Петров Петр Петрович", "ИТ специалист", "petrov.petr@supercompany.ru", "+7 913 740 40 42", 200000, 42);
        employers[4] = new Employer("Семенова Ксения Семеновна", "менеджер HR", "semenova.kseniya@supercompany.ru", "+7 913 740 40 40", 100000, 18);

        for (Employer o : employers) {
            if (o.getAge()>40) o.info();
        }
    }
}
