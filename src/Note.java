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

    public String getNewName() {
        return newName;
    }

    @Override
    public String toString() {
        return getOldName() + " " + getNewName() + "\n";
    }
}
