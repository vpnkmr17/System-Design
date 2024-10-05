
/*
 * To handle operation related to database
*/
public class DataAccessLayer {
    private Database dbObj;
    
    public DataAccessLayer(Database dbObj) {
        this.dbObj = dbObj; // Constructor injection
    }

    public void saveData() {
        dbObj.save();
    }
}