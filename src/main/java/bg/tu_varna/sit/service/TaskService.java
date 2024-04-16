package bg.tu_varna.sit.service;

import bg.tu_varna.sit.model.Task;
import bg.tu_varna.sit.dto.TaskDTO;

import java.util.List;

public interface TaskService {
    TaskDTO createTask(TaskDTO taskdto);
    List<TaskDTO> getAllTasks();
    TaskDTO getTaskById(Long id);
    TaskDTO updateTask(TaskDTO taskdto);
    void deleteTask(Long id);
}
