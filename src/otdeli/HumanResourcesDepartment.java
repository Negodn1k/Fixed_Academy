package otdeli;

public class HumanResourcesDepartment extends Department{
    public boolean isAnEmployee = false;            //Является ли сотрудником, по умполчанию = нет
    public String nameOfEmployee;                   // Имя сотрудника
    public String surnameOfEmployee;                //Фамилия сотрудника

    public void checkWorker() {                     //Проверка есть ли такой работник
        if ((idEmployee != 0) && (!nameOfEmployee.isEmpty())
                && (!surnameOfEmployee.isEmpty())) {
            isAnEmployee = true;
        }
        else {
            isAnEmployee = false;
        }
    }
}
