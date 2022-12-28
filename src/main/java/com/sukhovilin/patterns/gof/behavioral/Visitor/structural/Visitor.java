package com.sukhovilin.patterns.gof.behavioral.Visitor.structural;

/**
 * The 'Visitor' abstract class
 */
public abstract class Visitor {
    public abstract void VisitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void VisitConcreteElementB(ConcreteElementB concreteElementB);
}
