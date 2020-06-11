import interfaces.UserActivities;

import java.util.HashMap;

public class UserStructure implements UserActivities {
    private int userID;
    private String username;
    private String password;
    private HashMap<Integer, ListStructure> lists;
    private int listID = 0;

    UserStructure(int id, String name, String password){
        this.userID = id;
        this.username = name;
        this.password = password;
        this.lists = new HashMap<>();
    }

    public int getUserID(){
        return this.userID;
    }

    public int creatList(String name){
        this.lists.put(this.listID, new ListStructure(this.listID, name));
        int currListId = this.listID;
        this.listID++;
        return currListId;
    }

    public boolean modifyListName(int listID, String newListName){
        ListStructure currList = this.lists.getOrDefault(listID, null);
        if(currList != null) {
            currList.setName(newListName);
            return true;
        } else {
            System.out.println("The given listId is invalid; cannot modify list");
            return false;
        }

    }

    public boolean deleteList(String listName, int listID){
        ListStructure currList = this.lists.getOrDefault(listID, null);
        if(currList != null) {
            this.lists.remove(listID);
            return true;
        } else {
            System.out.println("The given listId is invalid; cannot delete list");
            return false;
        }

    }

}
