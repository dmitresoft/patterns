package com.sukhovilin.tasks.celebrity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Deutsche Bank, real interview question.
 * Find the celebrity.
 */
public class App {

    public static void main(String[] args) {

        Person p1 = new Person("BIll Gates", new ArrayList<>());
        Person p2 = new Person("John", List.of(p1));
        Person p3 = new Person("Michael", List.of(p1, p2));
        Person p4 = new Person("Oleg", List.of(p1, p3));
        Person p5 = new Person("Nik", List.of(p1, p4));

        Person[] people = {p1, p2, p3, p4, p5};

        new App().case1(people);
        new App().case2(people);
    }

    /**
     * Simple O(N2)
     */
    private void case1(Person[] people) {
        boolean hasFrieds = false;
        for (Person a1 : people) {
            for (Person a2 : people) {
                if (!a1.equals(a2)) { //
                    if (a1.isFriend(a2)) {
                        hasFrieds = true;
                        break;
                    }
                }
            }
            if (!hasFrieds) System.out.println(a1);
        }
    } // case 1


    /**
     * With optimization.
     */
    private void case2(Person[] people) {

        int f = 0;
        int l = people.length - 1;

        for (int i = 0; i < people.length; i++) { // while (f <= l)

            Person p1 = people[f];
            Person p2 = people[l];

            if (p1.isFriend(p2)) {
                f++;
            } else {
                l--;
            }

            if (f == l) {
                System.out.println(p1);
            }

        }

    }

}
