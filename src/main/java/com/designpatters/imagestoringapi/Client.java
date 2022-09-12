package com.designpatters.imagestoringapi;

import java.io.IOException;

public class Client {
    public static void main(String[] args)throws IOException {
        Image image = new Image();
        image.setBmp(new Bitmap());
        image.setFileName("C:/Users/pprateek/images/img");

        //Compress image before storing it
        //Encrypt image before storing it
        image = new CompressionImageDecorator(image);
        image = new EncryptionImageDecorator(image);

        image.saveImageToDisk();
        image.readImageFromDisk();
    }
}
