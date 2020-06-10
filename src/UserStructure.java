import java.util.*;

public class UserStructure {
    private int userID;
    private String username;
    private String password;
    private List<Integer> listOfItems;

    UserStructure(int id, String name, String password){
        this.userID = id;
        this.username = name;
        this.password = password;
    }

}
