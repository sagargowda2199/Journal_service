package com.Journals.Journals.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.util.backoff.FixedBackOff;

@EnableKafka
@Configuration
public class SeekToCurrentErrorHandler {

    @Autowired
    private FixedBackOff fixedBackOff;

    public SeekToCurrentErrorHandler(FixedBackOff fixedBackOff) {
    }
}
