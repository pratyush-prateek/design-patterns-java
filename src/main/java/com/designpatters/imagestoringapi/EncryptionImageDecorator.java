package com.designpatters.imagestoringapi;

public class EncryptionImageDecorator extends BaseImageDecorator{
    public EncryptionImageDecorator(Image image) {
        super(image);
    }

    @Override
    public void saveImageToDisk() {
        this.encryptImage();
        super.saveImageToDisk();
    }

    @Override
    public void readImageFromDisk() {
        super.readImageFromDisk();
        this.decryptImage();
    }

    private void encryptImage() {
        //Business logic for encryption
        System.out.println("Encrypting image");
    }

    private void decryptImage() {
        //Business logic for decryption
        System.out.println("Decrypting image");
    }
}
