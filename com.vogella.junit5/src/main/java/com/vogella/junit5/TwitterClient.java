package com.vogella.junit5;
public class TwitterClient {

	public void sendTweet(ITweet tweet) {
		String message = tweet.getMessage();
		
		// TODO send the message to Twitter
		System.out.println(message);
	}
}