package com.designpatters.texteditor.commands;

import com.designpatters.texteditor.Dll;

public abstract class Command {
    protected RequestParams requestParams;
    public Command(RequestParams requestParams) {
        this.requestParams = requestParams;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }

    public abstract void execute(Dll dll);
}
