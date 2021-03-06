package client.manufacturer.main;

public class Profile {
    private static Profile instance=null;
    private String displayName;
    private int id;
    private long timestamp;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    private Profile(){

    }
    public static Profile getInstance(){
        if(instance==null)
            instance=new Profile();
        return instance;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
