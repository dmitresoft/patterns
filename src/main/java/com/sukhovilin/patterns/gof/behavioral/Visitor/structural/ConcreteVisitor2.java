package com.sukhovilin.patterns.gof.behavioral.Visitor.structural;

/**
 * A 'ConcreteVisitor' class
 */
public class ConcreteVisitor2 extends Visitor {

    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        String result =
                String.format("%s visited by %s", concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println(result);
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        String result =
                String.format("%s visited by %s", concreteElementB.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println(result);
    }
}
