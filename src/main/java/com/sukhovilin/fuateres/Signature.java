package com.sukhovilin.fuateres;


public class Signature {


    public static void main(String[] args) throws CloneNotSupportedException {

        new Signature().go();

    }

    private void go() throws CloneNotSupportedException {

        Person p = new Person();
        p.name = "text";
        p.ii = 42;
        p.student = new Student();
        p.student.sname = "wow";



        Person p1 = (Person) p.clone();

        p.student.sname = "?";
        p.ii=2222;

        System.out.println(p1.name);
        System.out.println(p1.ii);
        System.out.println(p1.student.sname);


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
        public String sname ;
    }


}
