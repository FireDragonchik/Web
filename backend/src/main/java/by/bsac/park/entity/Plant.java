package by.bsac.park.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "plant")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name_plant",nullable = false)
    private String namePlant;

    @Basic
    @Column(name = "discription_plant",nullable = false)
    private String discriptionPlant;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "type_id",referencedColumnName = "id")
    private TypePlant typePlant;

//    @OneToMany(mappedBy = "plantId", cascade = CascadeType.ALL)
//    @JsonIgnore
//    private Collection<Forest> forest;
}
