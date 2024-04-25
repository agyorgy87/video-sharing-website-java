package com.example.videosharingwebsite;

class FreeVideo extends Video {

    public FreeVideo(String title, String uploader, double duration) {
        super(title, uploader, duration);
    }

    @Override
    public boolean isFree() {
        return true;
    }

    @Override
    public void play() {
        System.out.println("Video title: " + getTitle());
        System.out.println("Uploader: " + getUploader());
        System.out.println("Video duration: " + getDuration());
        System.out.println("Free Video Play");
    }

}
