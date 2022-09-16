package com.designpatters.texteditor.commands;

import com.designpatters.texteditor.Dll;

public class DisplayLinesCommand extends Command{
    public DisplayLinesCommand(RequestParams requestParams) {
        super(requestParams);
    }

    @Override
    public void execute(Dll dll) {
        dll.displayLines(this.requestParams.start, this.requestParams.end);
    }
}
