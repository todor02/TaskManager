package bg.tu_varna.sit.repository;

import bg.tu_varna.sit.model.Task;

public interface TaskRepository {
    Task createTask(Task task);
}
