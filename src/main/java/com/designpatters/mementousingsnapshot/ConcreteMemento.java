package com.designpatters.mementousingsnapshot;

public class ConcreteMemento implements Memento {
    private Originator originator;
    private int state1;
    private int state2;
    private String state3;
    public ConcreteMemento(Originator originator, int state1, int state2, String state3) {
        this.originator = originator;
        this.state1 = state1;
        this.state2 = state2;
        this.state3 = state3;
    }

    @Override
    public void restore() {
        this.originator.setState1(this.state1);
        this.originator.setState2(this.state2);
        this.originator.setState3(this.state3);
    }
}
