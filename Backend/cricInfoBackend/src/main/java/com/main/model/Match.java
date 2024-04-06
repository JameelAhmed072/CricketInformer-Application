package com.main.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name = "crick_matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matchId;

    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;
    private String matchLink;
    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date = new Date();


    // set the match status according to textComplete
    public void setMatchStatus(){
        if (textComplete.isBlank()){
            this.status = MatchStatus.LIVE;
        }else{
            this.status = MatchStatus.COMPLETED;
        }
    }



}
