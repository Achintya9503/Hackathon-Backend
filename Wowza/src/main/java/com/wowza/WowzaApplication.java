package com.wowza;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@SpringBootApplication
@EnableJpaRepositories("com.wowza.repository")
@EntityScan("com.wowza.model")
public class WowzaApplication {

	public static void main(String[] args) throws IOException,IllegalStateException {
		SpringApplication.run(WowzaApplication.class, args);
		FileInputStream serviceAccount;
		try {
			serviceAccount = new FileInputStream("src/main/resources/mufaddal_serviceJson.json");
			FirebaseOptions options;
			try {
				options = new FirebaseOptions.Builder()
					    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
					    .build();
				FirebaseApp.initializeApp(options);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
