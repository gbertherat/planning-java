package nc.univ.java.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table
@Getter
public class Cours {
    @Id @GeneratedValue
    long id;

    @Column(nullable = false)
    String libelle;
}
