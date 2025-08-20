package com.kham_pha_web.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import jakarta.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;


    @Configuration
    public class FirebaseConfig {


        @Value("classpath:myportfolio-8e547-firebase-adminsdk-fbsvc-ffbf1b9855.json")
        private Resource serviceAccountFile;

        @Value("https://myportfolio-8e547-default-rtdb.asia-southeast1.firebasedatabase.app/")
        private String databaseUrl;

        @PostConstruct
        public void initialize() throws IOException {
            // Sử dụng serviceAccountFile đã được Spring Boot nạp
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccountFile.getInputStream()))
                    .setDatabaseUrl(databaseUrl)
                    .build();

            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options);
            }
        }

        // Bean cho Firestore
        @Bean
        public Firestore firestore() {
            return FirestoreClient.getFirestore();
        }

        // Bean cho Realtime Database
        @Bean
        public DatabaseReference firebaseDatabase() {
            return FirebaseDatabase.getInstance().getReference();
        }
    }





