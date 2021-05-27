package nc.univ.java.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COURS")
@Getter
public class Cours {
    @Id @GeneratedValue
    long id;

    @Column
    Date date_debut;

    @Column
    Date date_fin;
}
