public class Main {
    static void main() {

        System.out.println("\n\tЗадание#1\n");

        String firstName = "Ivan"; //  Для хранения имени.
        String middleName = "Ivanovich"; // Для хранения отчества.
        String lastName = "Ivanov"; // Для хранения фамилии.
        String fullName = lastName + " " + firstName + " " + middleName; // Для хранения Ф. И. О.

        System.out.println("Ф.И.О. сотрудника " + fullName);

        System.out.println("\n\tЗадание#2\n");

        System.out.println(fullName.toUpperCase());

        System.out.println("\n\tЗадание#3\n");

        String fullName1 = "Иванов Семён Семёнович";
        String newFullName = fullName1.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника " + newFullName);

    }
}