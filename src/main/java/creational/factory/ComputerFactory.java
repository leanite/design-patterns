package creational.factory;

public class ComputerFactory {

    private ComputerFactory() {}

    public static Computer getComputer(Computer.Type type){

        switch (type) {
            case PC:
                return new PC("16GB", "HDD 1TB", "X8 4.5GHz");
            case LAPTOP:
                return new Laptop("8GB", "SSD 128GB", "i5 2.5GHz");
            case SERVER:
                return new Server("64GB", "SSD 1TB", "X32 6.0GHz");
            default:
                return null;
        }
    }
}
