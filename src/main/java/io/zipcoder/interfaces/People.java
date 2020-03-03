package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class People<E> implements Iterable<E>{
    ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById(Long id){
        for(Person person : personList){
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

    public Person[] toArray(){
        Person[] result = new Person[personList.size()];
        int i = 0;
        for(Person person : personList){
            result[i] = person;
            i++;
        }
        return result;
    }

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
