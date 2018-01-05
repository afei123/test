package DesignPatterns.IteratorPattern;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by AFei on 2017/10/17.
 */
public class TestList<E> implements Collection<E> {
    private Object[] asd = new Object[12];
    private int size = 0;
    private int modCount = 0;
    @Override
    public int size() {
        return size;
    }

    public boolean hasNext(){
        return modCount != size;
    }

    public E next(){
        return (E) asd[modCount++];
    }

    public E get(int i){
        return (E)asd[i];
    }

    @Override
    public boolean isEmpty() {
        return asd.length>0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return asd;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        boolean falg = false;
        try {
            if(size == asd.length-1){
                Object[] dsa = new Object[asd.length/2+asd.length];
                for (int i = 0 ; i < size ;i++){
                    dsa[i] = asd[i];
                }
                asd = dsa;
            }
            asd[size++] = e;
            falg = true;
        }catch(Exception es){
            System.out.println(es);
        }
        return falg;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
