package com.sukhovilin.patterns.gof.structural.Composite.structural;

/**
 * The 'Component' abstract class
 */
public abstract class Component {

    protected String name;

    // Constructor
    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);

    protected String createString(String value, int count) {
        int capacity = count * value.length();
        StringBuilder sb = new StringBuilder(capacity);
        for (int i = 0; i < count; i++) {
            sb.append(value);
        }
        return new String(sb);
    }
}
