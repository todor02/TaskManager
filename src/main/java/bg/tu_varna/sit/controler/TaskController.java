package bg.tu_varna.sit.controler;

import bg.tu_varna.sit.model.Task;
import bg.tu_varna.sit.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        Task addedTask = taskService.createTask(task);
        return new ResponseEntity<>(addedTask, HttpStatus.CREATED);
    }
}
