package by.bsac.park.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "forest")
public class Forest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "plant_id",nullable = false)
    private Integer plantId;

    @Basic
    @Column(name = "user_id",nullable = false)
    private Integer userId;

//    @ManyToOne
//    @JoinColumn(name = "plant_id", referencedColumnName = "id")
//    private Plant plantId;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User userId;

}
