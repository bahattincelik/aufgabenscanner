package de.wave_campus.aufgabenscanner.repository;

import de.wave_campus.aufgabenscanner.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
