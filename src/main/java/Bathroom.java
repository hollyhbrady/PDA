import java.util.ArrayList;

public class Bathroom {
    private ArrayList<IWash> items;

    public Bathroom() {
        this.items = new ArrayList<IWash>();
    }

    public void addItem(IWash item) {
        this.items.add(item);
    }

    public int getNumberOfItems() {
        return this.items.size();
    }

    public String washItem(int index) {
        IWash item = items.get(index);
        return item.wash();
    }
}
