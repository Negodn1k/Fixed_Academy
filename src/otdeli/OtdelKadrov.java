package otdeli;

public class OtdelKadrov extends Department{
    public boolean isAnEmployee = false;
    public String nameOfEmployee;
    public String surnameOfEmployee;

    public void checkWorker() {
        if ((idEmployee != 0) && (!nameOfEmployee.isEmpty())
                && (!surnameOfEmployee.isEmpty())) {
            isAnEmployee = true;
        }
        else {
            isAnEmployee = false;
        }
    }
}
