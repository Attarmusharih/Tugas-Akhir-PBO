public class Delete extends Data{

    String delete;
    String deleteFile;
    
    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getDeleteFile() {
        return deleteFile;
    }

    public void setDeleteFile(String deleteFile) {
        this.deleteFile = deleteFile;
    }

    public Delete(int privateData, int protectedData, int defaultData, int publicData, String delete,
            String deleteFile) {
        super(privateData, protectedData, defaultData, publicData);
        this.delete = delete;
        this.deleteFile = deleteFile;
    }

    public Delete(int privateData, int protectedData, int defaultData, int publicData) {
        super(privateData, protectedData, defaultData, publicData);
    }

}
