package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "social_medias" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SocialMedia {
    @Id
    @GeneratedValue(generator = "social_media",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "social_media_gen", sequenceName = "social_media_seq",
            allocationSize = 1)
    private Long id;
    private String name;
    @ToString.Exclude
    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private Person person;

    public SocialMedia(String name) {
        this.name = name;
    }
}
