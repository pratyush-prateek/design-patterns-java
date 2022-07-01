package com.designpatters.mementousingsnapshot;

public class UndoCommand implements Command {
    private MementoService mementoService;
    public UndoCommand(MementoService mementoService) {
        this.mementoService = mementoService;
    }

    @Override
    public void execute() throws Exception {
        this.mementoService.undo();
    }
}
