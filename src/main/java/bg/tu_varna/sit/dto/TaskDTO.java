package bg.tu_varna.sit.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private Date deadline;
}
