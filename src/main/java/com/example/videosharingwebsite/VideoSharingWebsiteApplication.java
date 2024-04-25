package com.example.videosharingwebsite;
import java.util.logging.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

//@SpringBootApplication
public class VideoSharingWebsiteApplication {

	private static final Logger LOGGER = Logger.getLogger(VideoSharingWebsiteApplication.class.getName());

	public static void main(String[] args) {

		//SpringApplication.run(VideoSharingWebsiteApplication.class, args);

		WebsiteUser user = new WebsiteUser("Joe", 10.0);
		FreeVideo freeVideo = new FreeVideo("Dog funny video", "Ross", 20.0);
		PaidVideo paidVideo = new PaidVideo("Skateboard fall", "Chandler", 15.0, 3.0);

		//free video watching
		user.watchVideo(freeVideo);
		user.watchVideo(paidVideo);

		user.purchasedVideo(paidVideo);
		user.watchVideo(paidVideo);
	}
}
