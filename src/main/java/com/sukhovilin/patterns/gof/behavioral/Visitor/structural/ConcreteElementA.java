package com.sukhovilin.patterns.gof.behavioral.Visitor.structural;

/**
 * A 'ConcreteElement' class
 */
public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
    }

    public void OperationA() {
    }
}
