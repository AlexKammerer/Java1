public class Lesson05 {

    static class Employee {
        private String fio;
        private String position;
        private String email;
        private String phoneNumber;
        private int salary;
        private int age;

        public Employee(String fio, String position, String email, String phoneNumber, int salary, int age) {
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        void Show() {
            System.out.println(fio + ", " + position + ", " + email + ", " + phoneNumber + ", " + salary + ", " + age);
        }
    }

    public static void main(String[] args) {

        Employee[] EmployeeArray = new Employee[5];
        EmployeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231200", 35000, 41);
        EmployeeArray[1] = new Employee("John Snow", "Officer", "johnsnow@mailbox.com", "88126478400", 25000, 32);
        EmployeeArray[2] = new Employee("Brandon Stark", "Director", "branstark@mail.box.com", "89319782193", 100000, 25);
        EmployeeArray[3] = new Employee("Jorah Mormont", "Secretary","jorah@mailbox.com", "88126490649", 30000, 55);
        EmployeeArray[4] = new Employee("Stannis Baratheon", "Developer", "Stanbarateon@mail.box.com", "88001000800", 45000, 45);

        for (Employee item : EmployeeArray) {
            if (item.getAge() > 40) item.Show();
        }
    }
}
