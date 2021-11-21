package by.bsac.park.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "work")
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "description",nullable = false)
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "worker_id",referencedColumnName = "id")
    private User workerId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "admin_id",referencedColumnName = "id")
    private User adminId;
}
