package oregontraildemo;

import model.Character;
import model.CharacterDefinitions;

public class OregonTrailDemo {
    public static void main(String[] args) {
        Character test = new Character(CharacterDefinitions.RED_SHIRT);
        test.setHuntingSkill(2);
        Character test2 = new Character(CharacterDefinitions.RED_SHIRT);
        
        System.out.println("Hello, world!");
    }
}
