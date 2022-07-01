package com.designpatters.mementousingsnapshot;

import java.util.Stack;

public class MementoService {
    private Stack<Memento> stack;
    private static MementoService instance;
    private MementoService() {
        this.stack = new Stack();
    }

    public static MementoService getInstance() {
        if(MementoService.instance == null) {
            synchronized(MementoService.class) {
                MementoService.instance = new MementoService();
            }
        }

        return MementoService.instance;
    }

    public void addHistory(Memento snapshot) {
        this.stack.push(snapshot);
    }

    public void undo() throws Exception {
        if(this.stack.size() == 0)
            throw new Exception("Nothing to undo");

        Memento snapshot = this.stack.pop();
        snapshot.restore();
    }
}
