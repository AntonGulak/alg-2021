

package ru.bgpu.lec.list;

public class LecList {

    private LecListItem first = null;
    private LecListItem last = null;
    private int size = 0;

    public void addFirst(Object value) {
        LecListItem item = new LecListItem(value);
        if(first == null) {
            first = item;
            last = item;
        } else {
            item.setNext(first);
            first = item;
        }
        size++;
    }

    public void addLast(Object value) {
        LecListItem item = new LecListItem(value);
        if(first == null) {
            first = item;
        } else {
            last.setNext(item);
        }
        last = item;
        size++;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String out = "[";
        LecListItem current = first;
        while (current != null) {
            out += current.getValue();
            if(current.getNext() != null) {
                out += ",";
            }
            current = current.getNext();
        }
        return out+"]";
    }
}
