package bg.tu_varna.sit.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @EqualsAndHashCode.Exclude
    @Column(name="title", length=30, nullable=false, unique=false)
    private String title;

    @EqualsAndHashCode.Exclude
    @Column(name="description", nullable=false, unique=false)
    private String description;

    @EqualsAndHashCode.Exclude
    @Column(name="deadline", nullable=false, unique=false)
    private Date deadline;
}
