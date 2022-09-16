package com.designpatters.texteditor.commands;

import com.designpatters.texteditor.Dll;

public class UndoCommand extends Command {
    public UndoCommand(RequestParams requestParams) {
        super(requestParams);
    }

    @Override
    public void execute(Dll dll) {
        dll.undo();
    }
}
