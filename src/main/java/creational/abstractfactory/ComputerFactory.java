package creational.abstractfactory;

public class ComputerFactory {

    private ComputerFactory() {}

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
