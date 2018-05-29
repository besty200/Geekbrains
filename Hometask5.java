/**
 * Java 1. Hometask 5.
 * @author Anton Lipin
 * @version created on 22.05.2018
 */
public class Hometask5 {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
        persArray[1] = new Person("Sidorov Nik", "Boss", " sidorov@mailbox.com", "892312356", 70000, 42);
        persArray[2] = new Person("Petrov Petr", "Administrator", "petrov@mailbox.com", "892312334", 50000, 25);
        persArray[3] = new Person("Katkov Denis", "Cleaner", "katkov@mailbox.com", "892312378", 15000, 55);
        persArray[4] = new Person("Avalotov Anton", "Programmist", "avalotov@mailbox.com", "892312300", 60000, 39);
        new Person().spisokPerson(persArray);
    }
}
    class Person {
        //ФИО, должность, email, телефон, зарплата, возраст;
        private String fio;
        private String trade;
        private  String email;
        private String tel;
        private int zp;
        private int age;

        public Person(String fio, String trade, String email, String tel, int zp, int age) {
            this.fio = fio;
            this.trade = trade;
            this.email = email;
            this.tel = tel;
            this.zp = zp;
            this.age = age;
        }

        public String getFio() {
            return fio;
        }

        public String getTrade() {
            return trade;
        }

        public String getEmail() {
            return email;
        }

        public String getTel() {
            return tel;
        }

        public int getZp() {
            return zp;
        }

        public int getAge() {
            return age;
        }

        public Person() {
        }

        void spisokPerson(Person[] pers) {
            for (int i = 0; i < 5; i++) {
                if (pers[i].age > 40) {
                    if (pers[i].age % 10 == 2 || pers[i].age % 10 == 3 || pers[i].age % 10 == 4)
                        System.out.println("Сотрудник" + (i + 1) + " " + pers[i].fio + " " + pers[i].age + " года");
                    else if (pers[i].age % 10 == 1)
                        System.out.println("Сотрудник" + (i + 1) + " " + pers[i].fio + " " + pers[i].age + " год");
                    else
                        System.out.println("Сотрудник" + (i + 1) + " " + pers[i].fio + " " + pers[i].age + " лет");
                }
            }
        }

    }


