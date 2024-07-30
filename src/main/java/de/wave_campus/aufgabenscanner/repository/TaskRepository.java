package de.wave_campus.aufgabenscanner.repository;

import de.wave_campus.aufgabenscanner.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
