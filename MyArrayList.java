
/**
 * Write a description of class MyArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class MyArrayList<E extends Comparable<E>> {
    private int size; // Number of elements in the list
    private E[] data;

    /** Create an empty list */
    public MyArrayList() {
        data = (E[]) new Comparable[100]; // Cannot create array of generics
        size = 0;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = e;
        size++;
    }

    public boolean contains(Object e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return true;
        return false;
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return data[index];
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        E e = data[index];
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];
        data[size - 1] = null;
        size--;
        return e;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(", ");
        }
        return result.toString() + "]";
    }

    public int size() {
        return size;
    }

    public boolean sortList() {
        Arrays.sort(data, 0, size);
        return true;
    }

    // New methods to be implemented
    public E getMax() {
        if (size == 0) return null;
        E max = data[0];
        for (int i = 1; i < size; i++) {
            if (data[i].compareTo(max) > 0) {
                max = data[i];
            }
        }
        return max;
    }

    public E getMin() {
        if (size == 0) return null;
        E min = data[0];
        for (int i = 1; i < size; i++) {
            if (data[i].compareTo(min) < 0) {
                min = data[i];
            }
        }
        return min;
    }

    public boolean equals(MyArrayList<E> other) {
        if (this.size != other.size) return false;
        for (int i = 0; i < this.size; i++) {
            if (!this.data[i].equals(other.data[i])) return false;
        }
        return true;
    }

    public MyArrayList<E> getUnique() {
        MyArrayList<E> uniqueList = new MyArrayList<>();
        for (int i = 0; i < size; i++) {
            if (!uniqueList.contains(data[i])) {
                uniqueList.add(uniqueList.size, data[i]);
            }
        }
        return uniqueList;
    }

    public boolean isPalindrome() {
        for (int i = 0; i < size / 2; i++) {
            if (!data[i].equals(data[size - 1 - i])) return false;
        }
        return true;
    }

    public MyArrayList<E> getFiltered(E threshold) {
        MyArrayList<E> filteredList = new MyArrayList<>();
        for (int i = 0; i < size; i++) {
            if (data[i].compareTo(threshold) > 0) {
                filteredList.add(filteredList.size, data[i]);
            }
        }
        return filteredList;
    }
}