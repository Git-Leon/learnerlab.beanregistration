package com.example.demo.domain.repos;

import com.example.demo.domain.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 8/27/18.
 */
public class People<PersonType extends Person> implements Iterable<PersonType> {
    private final List<PersonType> personList;

    public People(PersonType... persons) {
        this(new ArrayList<>(Arrays.asList(persons)));
    }

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public People<PersonType> addAll(Iterable<PersonType> persons) {
        persons.forEach(person -> personList.add(person));
        return this;
    }

    public PersonType findById(Long id) {
        return personList.stream()
                .filter(person -> person.getId().equals(id))
                .collect(Collectors.toList())
                .get(0);
    }

    public List<PersonType> findAll() {
        return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }
}
