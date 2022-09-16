package com.designpatters.texteditor.commands;

import com.designpatters.texteditor.Dll;

public class AppendCommand extends Command{
    public AppendCommand(RequestParams requestParams) {
        super(requestParams);
    }

    @Override
    public void execute(Dll dll) {
        dll.appendLast(this.requestParams.line);
    }
}
