package com.designpatters.imagestoringapi;

public class CompressionImageDecorator extends BaseImageDecorator{
    //Images would be compressed on storing
    //Decompressed while reading from the disk
    public CompressionImageDecorator(Image image) {
        super(image);
    }

    @Override
    public void saveImageToDisk() {
        this.compressImage();
        super.saveImageToDisk();
    }

    @Override
    public void readImageFromDisk() {
        super.readImageFromDisk();
        this.decompressImage();
    }

    private void compressImage() {
        //Business logic for compressing the image
        System.out.println("Compressing image");
    }

    private void decompressImage() {
        //Business logic for decompressing the image
        System.out.println("Decompressing the image");
    }
}
