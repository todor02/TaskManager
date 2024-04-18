package bg.tu_varna.sit.controller;

import bg.tu_varna.sit.dto.TaskDTO;
import bg.tu_varna.sit.exceptions.ResourceNotFoundException;
import bg.tu_varna.sit.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //    @GetMapping("/hello")
//    public String greeting1(@RequestParam(value="name") String name){
//        return "Hello " + name;
//    }
//    @GetMapping("/hello/{name}")
//    public String greeting2(@PathVariable String name){
//        return "Hello " + name;
//    }

    @PostMapping("/api/tasks")
    public ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO taskdto){
        TaskDTO addedTask = taskService.createTask(taskdto);
        return new ResponseEntity<>(addedTask, HttpStatus.CREATED);
    }

    @GetMapping("/api/tasks/{id}")
    public ResponseEntity<TaskDTO> getTaskById(@PathVariable Long id){
        return new ResponseEntity<>(taskService.getTaskById(id), HttpStatus.OK);
    }

    @GetMapping("/api/tasks")
    public ResponseEntity<List<TaskDTO>> getAllTasks(){
        return new ResponseEntity<>(taskService.getAllTasks(), HttpStatus.OK);
    }

    @PutMapping("/api/tasks")
    public ResponseEntity<TaskDTO> updateTaskById(@RequestBody TaskDTO taskdto){
        return new ResponseEntity<>(taskService.updateTask(taskdto), HttpStatus.OK);
    }

    @DeleteMapping("/api/tasks/{id}")
    public ResponseEntity<TaskDTO> deleteTaskById(@PathVariable Long id){
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
