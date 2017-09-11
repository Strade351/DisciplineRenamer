/**
 * Created by Anatoliy on 11.09.2017.
 */
public class Note {
    private String oldName;
    private String newName;
    Note(String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public String toString() {
        return getOldName() + " " + getNewName() + "\n";
    }
}
