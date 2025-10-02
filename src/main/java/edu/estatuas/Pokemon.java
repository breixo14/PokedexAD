package edu.estatuas;
import java.util.List;


public class Pokemon {

    private int id;
    private String name;
    private List<String> types;
    private String ability;
    private long exp;
    private Stats stats;
    private List<Evolution> evolutions;
    private GenderRatio genderRatio;
    private List<String> eggGroups;
    private String species;
    private double height;
    private double weight;
    private String description;
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