import java.util.*;

public class SummonedCharacter implements ISummoned {
    Character summonedChar;
    int level;
    int exp;
    List<Spell> activeSpells;
    
    public SummonedCharacter(Character summonedChar, int level, int exp) {
        this.summonedChar = summonedChar;
        this.level = level;
        this.exp = exp;
        activeSpells = new ArrayList<Spell>();
    }

    // getter
    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    // menambahkan spell ke dalam daftar spell aktif
    public void addSpell(Spell s) {
        activeSpells.add(s);
    }

    // mengembalikan daftar spell aktif
    public List<Spell> getActiveSpells() {
        return activeSpells;
    }

    // meningkatkan level karakter sebanyak 1
    // mereset xp ke 0
    // meningkatkan baseAtk dan baseHp sebanyak attackUp dan healthUp
    public void levelUp() {
        level += 1;
        exp = 0;
        summonedChar = new Character(summonedChar.getName(),
                                summonedChar.getAttackValue() + summonedChar.getAttackUpValue(),
                                summonedChar.getHpValue() + summonedChar.getHealthUpValue(),
                                summonedChar.getAttackUpValue(),
                                summonedChar.getHealthUpValue());
    }

    // menggambar kartu ke layar
    public void render() {
        System.out.println("Nama: " + summonedChar.getName());
        System.out.println("Level: " + level);
        System.out.println("Exp: " + exp);
        System.out.println("Atk: " + summonedChar.getAttackValue());
        System.out.println("Hp: " + summonedChar.getHpValue());
        System.out.println("Memiliki " + activeSpells.size() + " spell aktif:");
        for(int i = 0; i < activeSpells.size(); ++i) {
            System.out.println("- " + activeSpells.get(i).getName());
        }
        System.out.println();
    }
}