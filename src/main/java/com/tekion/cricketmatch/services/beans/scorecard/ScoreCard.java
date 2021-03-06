package com.tekion.cricketmatch.services.beans.scorecard;

import com.tekion.cricketmatch.services.beans.player.PlayerType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ScoreCardPkId.class)
public class ScoreCard {

  @Id private int matchId;
  @Id private int playerId;
  private int teamId;
  private String playerName;
  private PlayerType playerType;

  private int runsScored;
  private int bowlPlayed;
  private int noOfBoundaries;

  private int oversBowled;
  private int wicketsTaken;
  private int runsGiven;
}
