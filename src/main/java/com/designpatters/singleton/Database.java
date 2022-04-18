package com.designpatters.singleton;

public class Database {

    //Not thread safe
    private static Database instance;
    private Database() {
        //initialization code
    }

    public static Database getInstance() {
        if(Database.instance == null) {
            synchronized(Database.class) {
                if(Database.instance == null) {
                    Database.instance = new Database();
                }
            }
        }

        return Database.instance;
    }

    public static void businessLogic() {
        //business logic to be executed on the singleton
    }
}
