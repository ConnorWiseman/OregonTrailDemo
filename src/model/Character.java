package model;

public class Character {
    int huntingSkill;
    String name;
    
    public Character(CharacterDefinitions dfn) {
        this.name = dfn.name;
        
        this.setHuntingSkill(dfn.huntingSkill);
    }

    public int getHuntingSkill() {
        return huntingSkill;
    }

    public void setHuntingSkill(int huntingSkill) {
        this.huntingSkill = huntingSkill;
        
        if (this.huntingSkill >= 3) {
            this.huntingSkill = 2;
        }
        
        if (this.huntingSkill < 0) {
            this.huntingSkill = 0;
        }
    }
}
