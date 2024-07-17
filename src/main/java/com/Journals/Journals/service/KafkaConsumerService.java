package com.Journals.Journals.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @Autowired
    private JournalService journalService;

    @KafkaListener(topics = "user-events", groupId = "user-track-events")
    public void consume(String message) {
        try {
            // Log the message
            System.out.println("Consumed message: " + message);
            // Save to database
            journalService.saveJournal(message);
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Error processing message: " + message);
            e.printStackTrace();
        }

    }
}
