package com.example.videosharingwebsite;

class PaidVideo extends PurchasedVideo {

    public PaidVideo(String title, String uploader, double duration, double price) {
        super(title, uploader, duration, price);
    }

    @Override
    public void play() {
        System.out.println("Video title: " + getTitle());
        System.out.println("Uploader: " + getUploader());
        System.out.println("Video duration: " + getDuration());
        System.out.println("Paid Video Play");
    }
}
