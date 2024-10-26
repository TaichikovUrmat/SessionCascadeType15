package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "persons" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    @Id
    @GeneratedValue(generator = "person",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "person_gen", sequenceName = "person_seg",
                        allocationSize = 1)

    private Long id;
    private String Name;
    private  int age;
    @Column(unique = true)
    private String email;


    @OneToMany(mappedBy = "person",cascade =  {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST ,
            CascadeType.REFRESH },
            fetch = FetchType.EAGER)

    private List<SocialMedia> socialMedia;

    public Person(String name, int age, String email) {
        Name = name;
        this.age = age;
        this.email = email;
    }
}
