package Departments;

public class Department {
    public int idEmployee;                      //Ай ди работкника
    public String nameOfDepartment;             //Название департамента
    public int amountOfWorkers;                 //Колво работников

    public double coefficientOfEfficiency;      //Коэффицент эфективности
    public double salary;                       //Зарплата

    public double countSalary() {                   //Вычисление зарплаты
        if (coefficientOfEfficiency > 1.0) {
            salary = salary * 2;
        } else if (coefficientOfEfficiency < 1.0) {
            salary = salary * 0.8;
        }

        return salary;
    }
}
