package com.sukhovilin.patterns.gof.behavioral.Visitor.structural;

/**
 * A 'ConcreteElement' class
 */
public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
    }

    public void OperationB() {
    }
}
