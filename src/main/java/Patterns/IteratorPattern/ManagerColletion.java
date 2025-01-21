package Patterns.IteratorPattern;

public class ManagerColletion {
    String[] managers = {"Bob", "Jeff"};

    Iterator iterator() {
        return new ManagerIterator();
    }

    private class ManagerIterator implements Iterator {
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < managers.length;
        }

        @Override
        public Object next() {
            return managers[index++];
        }
    }
}
