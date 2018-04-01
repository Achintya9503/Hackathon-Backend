package com.wowza.service.fcm;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import com.wowza.model.User;

@Service
public class AndroidPushNotificationsService {

	private static final String FIREBASE_SERVER_KEY = "AAAAz_z9MWY:APA91bHmvCqcTd61A4SU7QyBFGb2awh91ZYnJ3Ouk4nS_5aVq8O0lrIJu6ljwNVFy4vsLYN5HrpLDODuuXvRFD28idA2mblvrea5Q9GV4Jx8dsO6hDCQIt7qJZu8_NKUc2VDDkKBNZBt";
	private static final String FIREBASE_API_URL = "https://fcm.googleapis.com/v1/projects/hackathon-android-a944c/messages:send";
	private static final String TOPIC = "live_stream_started";

	@Async
	public void send(User user) {
//		try {
//			System.out.println("send message to user called");
//			JSONObject body = new JSONObject();
//			body.put("to", "/topics/" + TOPIC);
//			body.put("priority", "high");
//
//			JSONObject notification = new JSONObject();
//			notification.put("title", user.getUsername()+" has started streaming");
//			notification.put("body", "Watch Now, Live!!");
//
//			JSONObject data = new JSONObject();
//			data.put("uid", user.getUid());
//
//			body.put("notification", notification);
//			body.put("data", data);
//
//			HttpEntity<String> request = new HttpEntity<>(body.toString());
//
//			RestTemplate restTemplate = new RestTemplate();
//
//			/**
//			 * https://fcm.googleapis.com/fcm/send Content-Type:application/json
//			 * Authorization:key=FIREBASE_SERVER_KEY
//			 */
//
//			ArrayList<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
//			interceptors.add(new HeaderRequestInterceptor("Authorization", "key=" + FIREBASE_SERVER_KEY));
//			interceptors.add(new HeaderRequestInterceptor("Content-Type", "application/json"));
//			restTemplate.setInterceptors(interceptors);
//
//			String firebaseResponse = restTemplate.postForObject(FIREBASE_API_URL, request, String.class);
//			System.out.println("Response came for firebaseResponse "+firebaseResponse);
//			CompletableFuture<String> pushNotification = CompletableFuture.completedFuture(firebaseResponse);
//			CompletableFuture.allOf(pushNotification).join();
//
//			String response = pushNotification.get();
//			System.out.println("Response came "+response);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		
		String topic = "live_stream_started";

		// See documentation on defining a message payload.
		Message message = Message.builder()
		    .putData("uid", user.getUid())
		    .setNotification(new Notification(user.getFullName() +" has started live stream","watch now!!"))
		    .setTopic(topic)
		    .build();

		// Send a message to the devices subscribed to the provided topic.
		String response;
		try {
			response = FirebaseMessaging.getInstance().sendAsync(message).get();
			// Response is a message ID string.
			System.out.println("Successfully sent message: " + response);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}