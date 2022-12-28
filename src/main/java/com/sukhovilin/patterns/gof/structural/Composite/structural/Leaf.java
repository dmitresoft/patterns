package com.sukhovilin.patterns.gof.structural.Composite.structural;

/**
 * The 'Leaf' class
 */
public class Leaf extends Component {

    // Constructor
    public Leaf(String name) {
        super(name);
    }


    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }


    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }


    public void display(int depth) {
        System.out.println(createString("-", depth) + name);
    }
}
