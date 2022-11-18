package Departments;

public class AccountingDepartment extends HumanResourcesDepartment {
    int prize = 0;
    int penalty = 1000;
    boolean hasPenalty = true;

    public void calculateSalary() {
        countSalary();
        checkPenalty();

        if (hasPenalty) {
            salary = salary - penalty;
        } else {
            salary = salary + prize;
        }

    }

    private void checkPenalty() {
        if (coefficientOfEfficiency > 1.0) {
            prize = 500;
            hasPenalty = false;
        } else if (coefficientOfEfficiency == 1.0) {
            prize = 0;
            penalty = 0;
            hasPenalty = false;
        } else {
            prize = 0;
            penalty = 1000;
            hasPenalty = true;
        }
    }
}
