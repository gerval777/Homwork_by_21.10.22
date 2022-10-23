public class Main {
    public static void main(String[] args) {
        //Строки. Задача 1
        System.out.println("Строки. Задача 1");

        String firstName = "Ivanich";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        lastName = lastName + " ";
        firstName = firstName + " ";
        String fullName = lastName + firstName + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        //Строки. Задача 2
        System.out.println("Строки. Задача 2");

        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
        System.out.println();

        //Строки. Задача 3
        System.out.println("Строки. Задача 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }
}