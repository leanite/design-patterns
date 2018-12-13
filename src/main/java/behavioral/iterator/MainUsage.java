package behavioral.iterator;

public class MainUsage {
    public static void main(String[] args) {
        NameIterator iterator = new NameIterator(new String[]{"Leandro", "Robert", "Dani", "Paul"});

        while(iterator.hasNext()) {
            String name = (String)iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
