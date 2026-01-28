package kz.se41.dbforassign3.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int height;
    private int weight;
    private String skill;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<Sport> sports = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    public Player() {
    }

    public Player(Long id, String name, int height, int weight, String skill, List<Sport> sports) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.skill = skill;
        this.sports = sports;
    }

}
