package com.designpatters.sportsbuzz.interfaces;

import com.designpatters.sportsbuzz.concrete.Game;

public interface Subscriber {
    public void notify(Game game);
}
