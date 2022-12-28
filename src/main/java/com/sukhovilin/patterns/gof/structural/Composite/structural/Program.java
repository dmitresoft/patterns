package com.sukhovilin.patterns.gof.structural.Composite.structural;

/**
 * Composite Design Pattern
 * <p>
 * Compose objects into tree structures to represent part-whole hierarchies.
 * Composite lets clients treat individual objects and compositions of objects uniformly.
 * </p>
 * <p>
 * The classes and/or objects participating in this pattern are:
 * Component (DrawingElement)
 *      - declares the interface for objects in the composition.
 *      - implements default behavior for the interface common to all classes, as appropriate.
 *      - declares an interface for accessing and managing its child components.
 *      - (optional) defines an interface for accessing a component's parent in the recursive
 *          structure, and implements it if that's appropriate.
 * Leaf (PrimitiveElement)
 *      - represents leaf objects in the composition. A leaf has no children.
 *      - defines behavior for primitive objects in the composition.
 * Composite (CompositeElement)
 *      - defines behavior for components having children.
 *      - stores child components.
 *      - implements child-related operations in the Component interface.
 * Client  (CompositeApp)
 *      - manipulates objects in the composition through the Component interface.
 * </p>
 * Author: Dmitry Sukhovilin
 * Date: Sep 10, 2010
 * Time: 12:14:36 AM
 */
public class Program {

    public static void main(String[] args) {

        // Create a tree structure
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);
        root.add(new Leaf("Leaf C"));

        // Add and remove a leaf
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        // Recursively display tree
        root.display(1);

    }

}
