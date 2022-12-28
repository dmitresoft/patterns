package com.sukhovilin.patterns.gof.behavioral.Visitor.structural;

public class Program {

    public static void main(String[] args) {

        // Setup structure
        ObjectStructure o = new ObjectStructure();
        o.Attach(new ConcreteElementA());
        o.Attach(new ConcreteElementB());

        // Create visitor objects
        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        ConcreteVisitor2 v2 = new ConcreteVisitor2();

        // Structure accepting visitors
        o.accept(v1);
        o.accept(v2);
    }
}
