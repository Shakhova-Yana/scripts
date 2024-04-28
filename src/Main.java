public class Main {
    public static void main(String[] args) {

        System.out.println("\nTask1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.format("%s %s %s %n", lastName, firstName, middleName);
        {
            System.out.println(fullName);
        }


        System.out.println("\nTask2");
        {
            System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s", fullName.toUpperCase());
        }

        System.out.println("\nTask3");
        fullName = "Иванов Семён Семёнович";
        String n = fullName.replace("ё", "е");
        {
            System.out.println(n);
        }
    }
}