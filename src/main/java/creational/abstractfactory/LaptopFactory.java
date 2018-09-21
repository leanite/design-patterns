package creational.abstractfactory;

public class LaptopFactory implements ComputerAbstractFactory {

    @Override
    public Computer createComputer() {
        return new Laptop("8GB", "SSD 128GB", "i5 2.5GHz");
    }
}