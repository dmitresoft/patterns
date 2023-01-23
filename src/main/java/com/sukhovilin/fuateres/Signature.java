package com.sukhovilin.fuateres;


import java.util.List;

public class Signature {


    public static void main(String[] args) throws CloneNotSupportedException {

        new Signature().go();

    }

    private void go() throws CloneNotSupportedException {

        List<Integer> list = List.of(1, 2, 3);

         list.stream().filter(x -> x != 2)
                 .forEach(System.out::println);






    }

    class Person implements Cloneable {

        public String name;
        public int ii;
        public Student student;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

    }

    class Student {
        public String sname;
    }


}
