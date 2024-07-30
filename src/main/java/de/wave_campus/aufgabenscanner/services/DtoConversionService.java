package de.wave_campus.aufgabenscanner.services;

import de.wave_campus.aufgabenscanner.dto.TagDto;
import de.wave_campus.aufgabenscanner.dto.TaskDto;
import de.wave_campus.aufgabenscanner.model.Tag;
import de.wave_campus.aufgabenscanner.model.Task;
import org.springframework.stereotype.Service;

@Service
public class DtoConversionService {

    public TaskDto converToDto(Task task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setName(task.getName());
        return taskDto;
    }

    public Task convertToEntity(TaskDto taskDto){
        Task task = new Task();
        task.setId(taskDto.getId());
        task.setName(taskDto.getName());
        return task;

    }

    public TagDto convetToDto(Tag tag){
        TagDto tagDto = new TagDto();
        tagDto.setId(tag.getId());
        tagDto.setName(tag.getName());
        return tagDto;

    }

    public Tag convetToEntity(TagDto tagDto){
        Tag tag = new Tag();
        tag.setId(tagDto.getId());
        tag.setName(tagDto.getName());
        return tag;


    }






}
