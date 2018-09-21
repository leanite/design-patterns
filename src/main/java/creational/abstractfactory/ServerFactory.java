package creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

    @Override
    public Computer createComputer() {
        return new Server("64GB", "SSD 1TB", "X32 6.0GHz");
    }
}