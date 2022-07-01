package com.designpatters.mementousingsnapshot;

public class Originator {
    private int state1;
    private int state2;
    private String state3;

    public Originator(int state1, int state2, String state3) {
        this.state1 = state1;
        this.state2 = state2;
        this.state3 = state3;
    }

    public void setState1(int state1) {
        this.state1 = state1;
    }

    public void setState2(int state2) {
        this.state2 = state2;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    public Memento getSnapshot() {
        return new ConcreteMemento(this, state1, state2, state3);
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state1=" + state1 +
                ", state2=" + state2 +
                ", state3='" + state3 + '\'' +
                '}';
    }
}
