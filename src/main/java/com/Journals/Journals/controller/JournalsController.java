package com.Journals.Journals.controller;


import com.Journals.Journals.entity.Journals;
import com.Journals.Journals.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/journals")
public class JournalsController {
    @Autowired
    private JournalService journalService;

    @GetMapping
    public ResponseEntity<List<Journals>> getAllJournals() {
        return ResponseEntity.ok(journalService.getAllJournals());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Journals> getJournalById(@PathVariable Integer id) {
        return ResponseEntity.ok(journalService.getJournalById(id));
    }
}
