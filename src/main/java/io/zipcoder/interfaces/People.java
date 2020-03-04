package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<E extends Person> implements Iterable<E>{
    ArrayList<E> personList = new ArrayList<>();


    public void add(E person){
        personList.add(person);
    }

    public E findById(Long id){
        for(E person : personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(findById(id));
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] getArray();

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }
}
