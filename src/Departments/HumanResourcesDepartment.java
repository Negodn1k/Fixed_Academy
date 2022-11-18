package Departments;

public class HumanResourcesDepartment extends Department {
    public String nameOfEmployee;                   // Имя сотрудника
    public String surnameOfEmployee;                //Фамилия сотрудника

    public void checkWorker() {                     //Проверка есть ли такой работник
        if ((idEmployee != 0) && (!nameOfEmployee.isEmpty())
                && (!surnameOfEmployee.isEmpty())) {
            System.out.println("Is an employee");
        } else {
            System.out.println("Not an employee");
        }
    }
}
