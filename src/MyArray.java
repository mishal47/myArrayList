public class MyArray {
    public Object[] array = new Object[10];
    int size = 0;

    public void add(Object value) {
        if (size == array.length) {
            Object[] array2 = new Object[size() + 1];
            System.arraycopy(array, 0, array2, 0, size());
            array = array2;
        }
            array[size] = value;
            size++;
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        for (int i = 0; i < size(); i++) {
            if (array[i] != null) {
                return false;
            }
        }
        return true;
    }

    public void add(Object value, int index) {
        if (size < index) {
            throw new RuntimeException("Error invalid index =(");
        } else if (size <= array.length) {
            Object[] array2 = new Object[array.length + 1];
            System.arraycopy(array, 0, array2, 0, index);
            System.arraycopy(array, index, array2, index + 1, size() - index);
            array2[index] = value;
            array = array2;
            size++;
        }
    }

    public void clear() {
        array = new Object[5];
        size = 0;
    }

    public void remove(int index) {
        if (size <= index) {
            throw new RuntimeException("Error invalid index =(");
        } else {
            Object[] array2 = new Object[array.length];
            System.arraycopy(array, 0, array2, 0, index);
            System.arraycopy(array, index + 1, array2, index, size - index - 1);
            array = array2;
            size--;
        }
    }

    boolean contains (Object value) {
        for (int i = 0; i < size(); i++) {
            if ((array[i] == null)){
                if (value == null) {
                    return true;
                }
            } else if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object value) {
        for (int i = 0; i < size(); i++) {
            if (array[i] == null) {
                if (value == null) {
                    return i;
                }
            } else if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf (Object value) {
        for (int i = size()-1; i >= 0; i--) {
            if (array[i] == null) {
                if (value == null) {
                    return i;
                }
            } else if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < size(); i++) {
            s += array[i] + " ";
        }
        return s;
    }

}









