package com.designpatters.texteditor.commands;

import com.designpatters.texteditor.Dll;

public class PasteCommand extends Command {
    public PasteCommand(RequestParams requestParams) {
        super(requestParams);
    }

    @Override
    public void execute(Dll dll) {
        dll.paste(this.requestParams.position);
    }
}
