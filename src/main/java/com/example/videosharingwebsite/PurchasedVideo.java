package com.example.videosharingwebsite;

class PurchasedVideo extends Video{

    private double price;

    public PurchasedVideo(String title, String uploader, double duration, double price) {
        super(title, uploader, duration);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public void play() {
        System.out.println("Video play now: " + this.getTitle());
    }
}
