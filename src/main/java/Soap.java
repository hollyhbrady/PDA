public class Soap implements IWash{
    private String name;
    private int uses;

    public Soap(String name, int uses) {
        this.name = name;
        this.uses = uses;
    }

    public String getName() {
        return name;
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public String wash(){
        return "Body is washed";
    }
}
