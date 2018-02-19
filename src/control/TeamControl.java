package control;

import model.Team;
import model.Character;

public class TeamControl {
    public static int calculateTeamHuntingSkill(Team team) {
        Character[] teamMembers = team.getTeamMembers();
        int totalHuntingSkill = 0;
        
        for (int i = 0; i < 3; i++) {
            totalHuntingSkill += teamMembers[i].getHuntingSkill();
        }
        
        return totalHuntingSkill;
    }
    
    public static int calculateHuntingIncrease(Team team, int huntedAnimalWeight) {
        int teamHuntingSkillLevel = TeamControl.calculateTeamHuntingSkill(team);
        int retained = 0;
        
        if (teamHuntingSkillLevel < 3) {
            retained = (int) (huntedAnimalWeight * 0.25);
        } else if (teamHuntingSkillLevel < 4) {
            // etc and so forth
        }
        
        return retained;
    }
}
