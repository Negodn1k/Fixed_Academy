package otdeli;

class AccountingDepartment extends HumanResourcesDepartment {
    int prize = 0;
    int penalty = 1000;
    boolean hasPenalty = true;

    double schitaemZarplatu() {
        countSalary();
        proveritShtrafi();

        if (hasPenalty == true) {
            salary = salary - penalty;
        }
        else {
            salary = salary + prize;
        }

        return salary;
    }

    private void proveritShtrafi() {
        if (coefficientOfEfficiency > 1.0) {
            prize = 500;
        }
        else if (coefficientOfEfficiency ==1.0) {
            prize = 0;
            penalty = 0;
            hasPenalty = false;
        }
        else {
            prize = 0;
            penalty = 1000;
            hasPenalty = true;
        }
    }
}
