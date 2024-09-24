package game.hero;

import java.util.Random;

public class Elf {
    private Random random = new Random();
    private int id = random.nextInt(1000);
    private boolean isImmortal = true;
    private short age = 5341;
    private String name = "Feanor";
    private boolean isGoodCharacter = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("ID should be more than 0.");
        }
    }

    public boolean isImmortal() {
        return isImmortal;
    }

    public void setImmortal(boolean isImmortal) {
        this.isImmortal = isImmortal;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age should be more than 0.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name shouldn't be empty");
        }
    }

    public boolean isGoodCharacter() {
        return isGoodCharacter;
    }

    public void setGoodCharacter(boolean isGoodCharacter) {
        this.isGoodCharacter = isGoodCharacter;
    }
}

