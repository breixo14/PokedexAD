package edu.estatuas;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("types")
    private List<String> types;
    @JsonProperty("ability")
    private String ability;
    @JsonProperty("exp")
    private long exp;
    @JsonProperty("stats")
    private Stats stats;
    @JsonProperty("evolutions")
    private List<Evolution> evolutions;
    @JsonProperty("genderRatio")
    private GenderRatio genderRatio;
    @JsonProperty("eggGroups")
    private List<String> eggGroups;
    @JsonProperty("species")
    private String species;
    @JsonProperty("height")
    private double height;
    @JsonProperty("weight")
    private double weight;
    @JsonProperty("description")
    private String description;
    @JsonProperty("moves")
    private List<Move> moves;

    public static class Stats {
        private int hp;
        private int atk;
        private int def;
        private int spd;
        private int sat;
        private int sdf;

        public int getHp() { return hp; }
        public int getAtk() { return atk; }
        public int getDef() { return def; }
        public int getSpd() { return spd; }
        public int getSat() { return sat; }
        public int getSdf() { return sdf; }
    }

    public static class Evolution {
        private int id;
        private String name;
        private int level; // nivel de evolución, 0 si no aplica

        public int getId() { return id; }
        public String getName() { return name; }
        public int getLevel() { return level; }
    }

    public static class GenderRatio {
        private double male;
        private double female;

        public double getMale() { return male; }
        public double getFemale() { return female; }
    }

    public static class Move {
        private String type; // level-up, TM, HM, egg
        private String name;
        private int level; // 0 si no aplica
        private String machine; // TM o HM, null si no aplica

        public String getType() { return type; }
        public String getName() { return name; }
        public int getLevel() { return level; }
        public String getMachine() { return machine; }
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public List<String> getTypes() { return types; }
    public String getAbility() { return ability; }
    public long getExp() { return exp; }
    public Stats getStats() { return stats; }
    public List<Evolution> getEvolutions() { return evolutions; }
    public GenderRatio getGenderRatio() { return genderRatio; }
    public List<String> getEggGroups() { return eggGroups; }
    public String getSpecies() { return species; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }
    public String getDescription() { return description; }
    public List<Move> getMoves() { return moves; }
}