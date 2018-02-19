package model;

public class Team {
    String name;
    
    Character[] teamMembers = new Character[3];

    public Character[] getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(Character[] teamMembers) {
        this.teamMembers = teamMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTeamResources() {
        return teamResources;
    }

    public void setTeamResources(String teamResources) {
        this.teamResources = teamResources;
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getDailyDistanceTraveled() {
        return dailyDistanceTraveled;
    }

    public void setDailyDistanceTraveled(String dailyDistanceTraveled) {
        this.dailyDistanceTraveled = dailyDistanceTraveled;
    }

    public String getLivestock() {
        return livestock;
    }

    public void setLivestock(String livestock) {
        this.livestock = livestock;
    }

    public double getCurrentWagonLoadWeight() {
        return currentWagonLoadWeight;
    }

    public void setCurrentWagonLoadWeight(double currentWagonLoadWeight) {
        this.currentWagonLoadWeight = currentWagonLoadWeight;
    }

    public boolean isTeamRest() {
        return teamRest;
    }

    public void setTeamRest(boolean teamRest) {
        this.teamRest = teamRest;
    }

    public int getTeamAllSkillLevel() {
        return teamAllSkillLevel;
    }

    public void setTeamAllSkillLevel(int teamAllSkillLevel) {
        this.teamAllSkillLevel = teamAllSkillLevel;
    }

    public int getTeamAnimalWeight() {
        return teamAnimalWeight;
    }

    public void setTeamAnimalWeight(int teamAnimalWeight) {
        this.teamAnimalWeight = teamAnimalWeight;
    }

    public int getTeamPlantWeight() {
        return teamPlantWeight;
    }

    public void setTeamPlantWeight(int teamPlantWeight) {
        this.teamPlantWeight = teamPlantWeight;
    }

    public int getTeamGatheringSkillLevel() {
        return teamGatheringSkillLevel;
    }

    public void setTeamGatheringSkillLevel(int teamGatheringSkillLevel) {
        this.teamGatheringSkillLevel = teamGatheringSkillLevel;
    }

    public String getTeamInventoryResource() {
        return teamInventoryResource;
    }

    public void setTeamInventoryResource(String teamInventoryResource) {
        this.teamInventoryResource = teamInventoryResource;
    }

    public int getTeamMoney() {
        return teamMoney;
    }

    public void setTeamMoney(int teamMoney) {
        this.teamMoney = teamMoney;
    }

    public Inventory getTeamInventory() {
        return teamInventory;
    }

    public void setTeamInventory(Inventory teamInventory) {
        this.teamInventory = teamInventory;
    }
    String status;
    String teamResources;
    String pace; // ?
    int members;
    String dailyDistanceTraveled;
    String livestock;
    double currentWagonLoadWeight;
    boolean teamRest;
    int teamAllSkillLevel;
    int teamAnimalWeight;
    int teamPlantWeight;
    int teamHuntingSkillLevel;
    int teamGatheringSkillLevel;
    String teamInventoryResource;
    int teamMoney;
    Inventory teamInventory;
}
