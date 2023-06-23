public class Edit extends Data{

    int edit;
    int editedData;
    
    public int getEdit() {
        return edit;
    }

    public void setEdit(int edit) {
        this.edit = edit;
    }

    public int getEditedData() {
        return editedData;
    }

    public void setEditedData(int editedData) {
        this.editedData = editedData;
    }

    public Edit(int privateData, int protectedData, int defaultData, int publicData, int edit, int editedData) {
        super(privateData, protectedData, defaultData, publicData);
        this.edit = edit;
        this.editedData = editedData;
    }

    public Edit(int privateData, int protectedData, int defaultData, int publicData){
        super(privateData, protectedData, defaultData, publicData);
        
    }
}
