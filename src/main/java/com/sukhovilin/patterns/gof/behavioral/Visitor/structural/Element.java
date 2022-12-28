package com.sukhovilin.patterns.gof.behavioral.Visitor.structural;

/**
 * The 'Element' abstract class
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
