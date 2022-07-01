package com.designpatters.mementousingsnapshot;

public class SetState3Command implements Command {
    private MementoService mementoService;
    private Originator originator;
    public SetState3Command(MementoService mementoService, Originator originator) {
        this.mementoService = mementoService;
        this.originator = originator;
    }

    @Override
    public void execute() {
        Memento snapshot = this.originator.getSnapshot();
        mementoService.addHistory(snapshot);
        this.originator.setState3("State 3 is set");
    }
}
