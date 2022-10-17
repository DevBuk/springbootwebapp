package in.devbuk.springbootwebapp.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "hour")
public class Hour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Boolean locked;
    @Column
    private String name;
    @ManyToOne
    private Day day;
    @OneToOne
    User user;

    public Hour(String name) {
        this.name = name;
    }
}
