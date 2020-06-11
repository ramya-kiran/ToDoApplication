import java.util.Map;

public class ListStructure {
    private String listName;
    private int listID;
    private Map<Integer, ItemStructure> items;

    ListStructure(int listID, String listName){
        this.listID = listID;
        this.listName = listName;
    }

    public void setName(String newName){
        this.listName = newName;
    }

}
