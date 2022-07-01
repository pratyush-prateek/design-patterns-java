package com.designpatters.mementousingsnapshot;

public class SetState2Command implements Command {
    private MementoService mementoService;
    private Originator originator;
    public SetState2Command(MementoService mementoService, Originator originator) {
        this.mementoService = mementoService;
        this.originator = originator;
    }

    @Override
    public void execute() {
        Memento snapshot = this.originator.getSnapshot();
        mementoService.addHistory(snapshot);
        this.originator.setState2(123);
    }
}
