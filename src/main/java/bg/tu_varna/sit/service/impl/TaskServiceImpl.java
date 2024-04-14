package bg.tu_varna.sit.service.impl;

import bg.tu_varna.sit.model.Task;
import bg.tu_varna.sit.repository.TaskRepository;
import bg.tu_varna.sit.repository.impl.TaskRepositoryImpl;
import bg.tu_varna.sit.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    public TaskServiceImpl() {
        taskRepository = TaskRepositoryImpl.getInstance();
    }

    @Override
    public Task createTask(Task task) {
        Task createdTask = taskRepository.createTask(task);
        return createdTask;
    }
}
