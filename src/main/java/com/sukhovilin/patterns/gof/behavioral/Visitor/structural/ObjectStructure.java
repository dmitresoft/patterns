package com.sukhovilin.patterns.gof.behavioral.Visitor.structural;

import java.util.ArrayList;
import java.util.List;

/**
 * The 'ObjectStructure' class
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<Element>();

    public void Attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

}
