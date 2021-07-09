public class Shampoo implements IWash{
    private String name;
    private String scent;
    private int uses;

    public Shampoo(String name, String scent, int uses) {
        this.name = name;
        this.scent = scent;
        this.uses = uses;
    }

    public String getName() {
        return name;
    }

    public String getScent() {
        return scent;
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public String wash() {
        return "Hair is washed";
    }
}
