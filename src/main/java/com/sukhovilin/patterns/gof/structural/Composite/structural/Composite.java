package com.sukhovilin.patterns.gof.structural.Composite.structural;

import java.util.ArrayList;
import java.util.List;

/**
 * The 'Composite' class
 */
public class Composite extends Component {

    private List<Component> _children = new ArrayList<Component>();

    // Constructor
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        _children.add(component);
    }

    @Override
    public void remove(Component component) {
        _children.remove(component);
    }

    @Override
    public void display(int depth) {

        System.out.println(createString("-", depth) + name);

        // Recursively display child nodes
        for (Component component : _children) {
            component.display(depth + 2);
        }

    }
}
