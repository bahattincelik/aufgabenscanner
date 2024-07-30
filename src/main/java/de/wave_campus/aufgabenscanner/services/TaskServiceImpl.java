package de.wave_campus.aufgabenscanner.services;

import de.wave_campus.aufgabenscanner.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl {

    @Autowired
    private TaskRepository taskRepository;


}
