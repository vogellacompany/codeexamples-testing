package com.vogella.junit5;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TwitterClientTest {
	
	@Mock 
	ITweet tweet;
	
	@Test
	public void testSendingTweet() {
		TwitterClient twitterClient = new TwitterClient();
	
		ITweet iTweet = mock(ITweet.class);
	
		when(iTweet.getMessage()).thenReturn("Using mockito is great");
	
		twitterClient.sendTweet(iTweet);
	}
}

