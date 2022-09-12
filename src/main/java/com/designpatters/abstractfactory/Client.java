package com.designpatters.abstractfactory;

public class Client {
    public static void main(String[] args) throws Exception {
        UIFactory factory;
        String arg = args[0];
        switch (arg) {
            case "Mac": {
                factory = new MacUIFactory();
                break;
            }
            case "Windows": {
                factory = new WindowsUIFactory();
                break;
            }
            default:
                throw new Exception("OS not supported");
        }

        factory.renderCheckbox(MetadataService.getOptions());
        factory.renderMenu(MetadataService.getMenuItems());
    }
}
