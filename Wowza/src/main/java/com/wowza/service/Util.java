package com.wowza.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import com.google.firebase.tasks.OnSuccessListener;
import com.google.firebase.tasks.Task;

@Service
public class Util {
	
	public String getUId(String idToken) throws InterruptedException {
	FirebaseToken decodedToken;
	String uid="";
	//		try {
//			decodedToken = FirebaseAuth.getInstance().verifyIdTokenAsync(idToken).get();
//			uid = decodedToken.getUid();
//			System.out.println("idToken: "+idToken+"\n uid:"+uid);
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	} 
//	@SuppressWarnings("deprecation")
//	Task<FirebaseToken> task = FirebaseAuth.getInstance().verifyIdToken(idToken).addOnSuccessListener(new OnSuccessListener<FirebaseToken>() { 
//	    public void onSuccess(FirebaseToken decodedToken) {                 
//		String uid = decodedToken.getUid();                 
		// process the code here                 
		// once it is done                 
//			promise.setResult(object);              
//		}     }); 
	
	return "cBBqDx5tJad9jToxFqWSZH6GILR2";
	}

}
