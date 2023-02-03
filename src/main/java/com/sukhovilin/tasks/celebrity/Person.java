package com.sukhovilin.tasks.celebrity;

import java.util.Collection;

public class Person {

    final String name;
    final Collection<Person> persons;

    public Person(String name, Collection<Person> persons) {
        this.name = name;
        this.persons = persons;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person other)) return false;
        return name.equals(other.name);
    }

    public boolean isFriend(Person person) {
        for (Person person1 : persons) {
            if (person1.equals(person)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

}
