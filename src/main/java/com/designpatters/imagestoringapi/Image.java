package com.designpatters.imagestoringapi;

public class Image {
    Bitmap bmp;
    String fileName;

    public Bitmap getBmp() {
        return bmp;
    }

    public void setBmp(Bitmap bmp) {
        this.bmp = bmp;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void saveImageToDisk() {
        System.out.println("Saving image to disk");
    }

    public void readImageFromDisk() {
        System.out.println("Reading image from disk");
    }
}
