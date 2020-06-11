package interfaces;

public interface UserActivities {
    int creatList(String name);
    boolean modifyListName(int listID, String newListName);
    boolean deleteList(String listName, int listID);
}
