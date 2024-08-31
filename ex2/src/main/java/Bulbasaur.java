public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur(int id, int level) {
        // TODO: Initialize id and level with appropriate values
        this.id = id;
        this.level = level;
    }

    // setLevel method
    public void setLevel(int lv) {
        // TODO: Implement this method
        // Update the level
        // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        // If the new level is 32 or higher, evolve to Venusaur
        if(lv > 16 && lv < 32){
            level = lv;
            id = 2;
        }
        if(lv >= 32){
            level = lv;
            id = 3;
        }
    }

    // getLevel method
    public int getLevel() {
        // TODO: Implement this method
        return level;
    }

    // getName method
    public String getName() {
        // TODO: Implement this method
        // Return the name based on the current id
        String name = "";
        if(id == 1)
        {
            name = "Bulbasaur";
        }
        if(id == 2)
        {
            name = "Ivysaur";
        }
        if(id == 3)
        {
            name = "Venusaur";
        }
        return name; 
    }

    // getID method
    public int getID() {
        // TODO: Implement this method
        return id; 
    }

    // toString method
    @Override
    public String toString() {
        // TODO: Implement this method
        // Return a string representation of the Bulbasaur object
        return "Bulbasaur: Level " + level + ", ID: " + id; 
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // TODO: Implement this method
        // Compare this Bulbasaur object with another object
        if(this.id == ((Bulbasaur)obj).getID() && this.level == ((Bulbasaur)obj).getLevel()){
            return true;
        }
        else{
            return false;
        }  
    }

    // copy method
    public Bulbasaur copy() {
        // TODO: Implement this method
        // Create and return a new Bulbasaur object with the same id and level
        return new Bulbasaur(this.id, this.level);
    }
}
