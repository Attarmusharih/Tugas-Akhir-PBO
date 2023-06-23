public class Data implements SelectedClass{
    int privateData;
    int protectedData;
    int defaultData; 
    int publicData;

    public int getPrivateData() {
        return privateData;
    }
    public void setPrivateData(int privateData) {
        this.privateData = privateData;
    }
    public int getProtectedData() {
        return protectedData;
    }
    public void setProtectedData(int protectedData) {
        this.protectedData = protectedData;
    }
    public int getDefaultData() {
        return defaultData;
    }
    public void setDefaultData(int defaultData) {
        this.defaultData = defaultData;
    }
    public int getPublicData() {
        return publicData;
    }
    public void setPublicData(int publicData) {
        this.publicData = publicData;
    }
    public Data(int privateData, int protectedData, int defaultData, int publicData) {
        this.privateData = privateData;
        this.protectedData = protectedData;
        this.defaultData = defaultData;
        this.publicData = publicData;
    }

    public void printData() {
        System.out.println("privateData: " + privateData);
        System.out.println("protectedData: " + protectedData);
        System.out.println("defaultData: " + defaultData);
        System.out.println("publicData: " + publicData);
    }
    @Override
    public void selectedClass() {
    }
}
