package creational.builder;

public abstract class Spell {

    private String name;
    private int manaCost;
    private int baseDamage;
    private float spellModifier;

    public Spell(String name, int manaCost, int baseDamage, float spellModifier) {
        this.name = name;
        this.manaCost = manaCost;
        this.baseDamage = baseDamage;
        this.spellModifier = spellModifier;
    }

    public abstract int calculateSpellDamage(Character caster);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public float getSpellModifier() {
        return spellModifier;
    }

    public void setSpellModifier(float spellModifier) {
        this.spellModifier = spellModifier;
    }
}
