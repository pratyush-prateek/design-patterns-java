package com.designpatters.texteditor.commands;

import com.designpatters.texteditor.Dll;

public class InsertCommand extends Command{
    public InsertCommand(RequestParams requestParams) {
        super(requestParams);
    }

    @Override
    public void execute(Dll dll) {
        dll.insert(this.requestParams.line, this.requestParams.position);
    }
}
