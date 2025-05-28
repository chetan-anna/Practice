package com.prototype.src;

import java.util.HashMap;
import java.util.Map;

interface GameCharacter extends Cloneable {
    GameCharacter clone();
}

class Stats {
    int strength, agility, magic;
    Stats(int s, int a, int m) {
        strength = s;
        agility = a;
        magic = m;
    }

    public Stats clone() {
        return new Stats(strength, agility, magic);
    }
}

class Knight implements GameCharacter {
    String name;
    Stats stats;

    Knight(String name, Stats stats) {
        this.name = name;
        this.stats = stats;
    }

    @Override
    public Knight clone() {
        return new Knight(this.name, this.stats.clone());  // deep copy
    }

    public String toString() {
        return "Knight " + name + " [STR=" + stats.strength + "]";
    }
}

// Registry
public class protoTypeRegistery {
    Map<String, GameCharacter> prototypes = new HashMap<>();

    public void register(String type, GameCharacter prototype) {
        prototypes.put(type, prototype);
    }

    public GameCharacter get(String type) {
        return prototypes.get(type).clone();
    }
    public static void main(String[] args) {
    	protoTypeRegistery registry = new protoTypeRegistery();
    	registry.register("knight", new Knight("BaseKnight", new Stats(100, 40, 10)));
    	registry.register("cknight", new Knight("ChildKnight", new Stats(10, 4, 1)));

    	GameCharacter player1 = registry.get("knight");
    	((Knight) player1).name = "Arthas";  // Customize
    	

    	System.out.println(player1);  // Knight Arthas [STR=100]
    	
    	GameCharacter player2 = registry.get("cknight");
    	((Knight) player2).name = "cummins";  // Customize
    	

    	System.out.println(player2);  // Knight Arthas [STR=100]

	}
}
