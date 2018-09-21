package creational.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {

    @Override
    public Computer createComputer() {
        return new PC("16GB", "HDD 1TB", "X8 4.5GHz");
    }
}