package bg.tu_varna.sit.repository;

import bg.tu_varna.sit.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>{
}
