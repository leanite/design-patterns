package creational.builder;

import java.util.List;

public class Character {

    private String name;
    private String charClass;
    private boolean alive;
    private int hp;
    private int mana;
    private int attackPower;
    private float attackModifier;
    private int magicPower;
    private int defense;
    private float defenseModifier;
    private int magicDefense;
    private float magicDefenseModifier;
    private Weapon weapon;
    private List<Spell> spells;

    public void attack(Character target, int damage) {
        target.takeDamage(damage);
    }

    private int getBaseDamage() {
        return Math.round(attackPower * attackModifier);
    }

    public void takeDamage(int damage){
        loseHitPoints(damage);
        checkAliveStatus();
    }

    private int calculateDefense(int attribute, float modifier) {
        return Math.round(attribute * modifier);
    }

    private void loseHitPoints(int trueDamage) {
        hp -= trueDamage;
    }

    private void checkAliveStatus() {
        if(hp <= 0)
            alive = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public float getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(float attackModifier) {
        this.attackModifier = attackModifier;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public float getDefenseModifier() {
        return defenseModifier;
    }

    public void setDefenseModifier(float defenseModifier) {
        this.defenseModifier = defenseModifier;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    public float getMagicDefenseModifier() {
        return magicDefenseModifier;
    }

    public void setMagicDefenseModifier(float magicDefenseModifier) {
        this.magicDefenseModifier = magicDefenseModifier;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean hasWeapon(){
        return weapon != null;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public boolean hasSpells() {
        return !spells.isEmpty();
    }

    public static class Builder {

        private Character instance;

        public Builder() {
            this.instance = new Character();
            this.instance.alive = true;
        }

        public Builder name(String name) {
            instance.setName(name);
            return this;
        }

        public Builder charClass(String charClass) {
            instance.setCharClass(charClass);
            return this;
        }

        public Builder hp(int hp){
            instance.setHp(hp);
            return this;
        }

        public Builder mana(int mana) {
            instance.setMana(mana);
            return this;
        }

        public Builder attackPower(int attackPower) {
            instance.setAttackPower(attackPower);
            return this;
        }

        public Builder magicPower(int magicPower) {
            instance.setMagicPower(magicPower);
            return this;
        }

        public Builder defense(int defense) {
            instance.setDefense(defense);
            return this;
        }

        public Builder magicDefense(int magicDefense) {
            instance.setMagicDefense(magicDefense);
            return this;
        }

        public Builder spells(List<Spell> spells) {
            instance.setSpells(spells);
            return this;
        }

        public Character build(){
            return instance;
        }
    }

}
