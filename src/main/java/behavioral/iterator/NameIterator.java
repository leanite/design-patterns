package behavioral.iterator;

public class NameIterator implements Iterator {

    private String names[];
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        if(index < names.length){
            return true;
        }

        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return names[index++];
        }

        return null;
    }
}
