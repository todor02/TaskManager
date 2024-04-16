package bg.tu_varna.sit.service.impl;

import bg.tu_varna.sit.dto.TaskDTO;
import bg.tu_varna.sit.model.Task;
import bg.tu_varna.sit.repository.TaskRepository;
import bg.tu_varna.sit.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }



    /**
     * This method is used to map a Task entity to a TaskDTO.
     *
     * @param task The Task entity that is to be mapped to a TaskDTO.
     * @return TaskDTO The mapped TaskDTO from the provided Task entity.
     */
    private TaskDTO mapToDTO(Task task) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(task, TaskDTO.class);
    }

    /**
     * This method is used to map a TaskDTO to a Task entity.
     *
     * @param taskDTO The TaskDTO that is to be mapped to a Task entity.
     * @return Task The mapped Task entity from the provided TaskDTO.
     */
    private Task mapToEntity(TaskDTO taskDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(taskDTO, Task.class);
    }



    @Override
    public TaskDTO createTask(TaskDTO taskdto) {
        Task mapped = mapToEntity(taskdto);
        Task createdTask = taskRepository.save(mapped);
        return mapToDTO(createdTask);
    }

    @Override
    public List<TaskDTO> getAllTasks() {
        return taskRepository.findAll().stream().map(this::mapToDTO).toList();
    }

    @Override
    public TaskDTO getTaskById(Long id) {
        return mapToDTO(taskRepository.findById(id).orElse(null));
    }

    @Override
    public TaskDTO updateTask(TaskDTO taskdto) {
        return mapToDTO(taskRepository.save(mapToEntity(taskdto)));
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
