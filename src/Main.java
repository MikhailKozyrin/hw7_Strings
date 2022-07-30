public class Main {
    public static void main(String[] args) {

        //Task 1
        String firstName = "Михаил";
        String middleName = "Андреевич";
        String lastName = "Козырин";
        String fullName = lastName + " " + firstName + " " + middleName + ".";
        System.out.println("ФИО сотрудника - " + fullName);

        //Task 2
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);

        //Task 3
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2 + ".");
    }
}