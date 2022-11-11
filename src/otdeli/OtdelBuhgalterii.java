package otdeli;

class OtdelBuhgalterii extends OtdelKadrov{
    int premiya = 0;
    int shtraf = 1000;
    boolean shtrafy = true;

    double schitaemZarplatu() {
        countSalary();
        proveritShtrafi();

        if (shtrafy == true) {
            salary = salary - shtraf;
        }
        else {
            salary = salary + premiya;
        }

        return salary;
    }

    private void proveritShtrafi() {
        if (coefficientOfEfficiency > 1.0) {
            premiya = 500;
        }
        else if (coefficientOfEfficiency ==1.0) {
            premiya = 0;
            shtraf = 0;
            shtrafy = false;
        }
        else {
            premiya = 0;
            shtraf = 1000;
            shtrafy = true;
        }
    }
}
