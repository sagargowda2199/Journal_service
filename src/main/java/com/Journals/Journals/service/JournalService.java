package com.Journals.Journals.service;

import com.Journals.Journals.entity.Journals;
import com.Journals.Journals.repository.JournalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService {
    @Autowired
    private JournalsRepository journalRepository;

    public void saveJournal(String message) {
        Journals journal = new Journals();
        journal.setMessage(message);
        journalRepository.save(journal);
    }

    public List<Journals> getAllJournals() {
        return journalRepository.findAll();
    }

    public Journals getJournalById(Integer id) {
        return journalRepository.findById(id).orElse(null);
    }
}
