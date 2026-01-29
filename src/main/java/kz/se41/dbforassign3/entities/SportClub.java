package kz.se41.dbforassign3.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "sportclub")
public class SportClub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clubs;
    private int memberscount;
    private String clubdescription;

    @ManyToOne
    @JoinColumn(name = "player_id")
    @JsonIgnore
    private Player player;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClubs() {
        return clubs;
    }

    public void setClubs(String clubs) {
        this.clubs = clubs;
    }

    public int getMemberscount() {
        return memberscount;
    }

    public void setMemberscount(int memberscount) {
        this.memberscount = memberscount;
    }

    public String getClubdescription() {
        return clubdescription;
    }

    public void setClubdescription(String clubdescription) {
        this.clubdescription = clubdescription;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public SportClub() {
    }

    public SportClub(Long id, String clubs, int memberscount, String clubdescription, Player player) {
        this.id = id;
        this.clubs = clubs;
        this.memberscount = memberscount;
        this.clubdescription = clubdescription;
        this.player = player;
    }
}
