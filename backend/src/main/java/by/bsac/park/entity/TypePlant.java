package by.bsac.park.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "type_plant")
public class TypePlant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name",nullable = false)
    private String name;

    @OneToOne (mappedBy = "typePlant",cascade = CascadeType.ALL)
    @JsonIgnore
    private Plant plant;
}
