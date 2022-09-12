package com.designpatters.imagestoringapi;

public class BaseImageDecorator extends Image{
    private Image image;
    public BaseImageDecorator(Image image) {
        this.image = image;
    }

    @Override
    public void saveImageToDisk() {
        this.image.saveImageToDisk();
    }

    @Override
    public void readImageFromDisk() {
        this.image.readImageFromDisk();
    }
}
