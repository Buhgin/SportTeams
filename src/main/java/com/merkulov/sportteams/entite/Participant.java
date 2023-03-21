package com.merkulov.sportteams.entite;

import com.merkulov.sportteams.enumerated.Role;
import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "participant", uniqueConstraints = {@UniqueConstraint(columnNames = {"first_name", "name"})})
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "team_id")
    private Team team;
    @Column(name= "name")
    private String name;
    @Column(name= "first_name")
    private String firstname;
    @Column(name= "surname")
    private String surname;
    @Column(name= "birthday")
    private LocalDate birthday;
    @Enumerated(EnumType.STRING)
    private Role role;





}
