package model;

public enum CharacterDefinitions {
    KIRK("Kirk", 5),
    SPOCK("Spock", 4),
    BONES("Bones", 3),
    RED_SHIRT("Red Shirt", -1);
    
    public String name;
    public int huntingSkill;
    
    CharacterDefinitions(String name, int h) {
        this.name = name;
        this.huntingSkill = h;
    }
}