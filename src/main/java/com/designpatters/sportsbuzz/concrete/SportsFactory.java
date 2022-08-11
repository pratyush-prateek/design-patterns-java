package com.designpatters.sportsbuzz.concrete;

import com.designpatters.sportsbuzz.enums.SportsType;
import com.designpatters.sportsbuzz.exceptions.SportNotSupportedException;
import com.designpatters.sportsbuzz.services.NotificationService;

public class SportsFactory {
    public static Sport getSportInstance(String id, String name, NotificationService notificationService, SportsType sportsType) throws SportNotSupportedException {
        switch(sportsType) {
            case CRICKET:
                return new Cricket(id, name, notificationService);
            case FOOTBALL:
                return new Football(id, name, notificationService);
            default:
                throw new SportNotSupportedException("Sport type not supported");
        }
    }
}
