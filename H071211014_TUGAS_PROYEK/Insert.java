public class Insert extends Data{

    double insertData;
    int insert;


    public double getInsertData() {
        return insertData;
    }


    public void setInsertData(double insertData) {
        this.insertData = insertData;
    }


    public int getInsert() {
        return insert;
    }


    public void setInsert(int insert) {
        this.insert = insert;
    }


    public Insert(int privateData, int protectedData, int defaultData, int publicData, double insertData, int insert) {
        super(privateData, protectedData, defaultData, publicData);
        this.insertData = insertData;
        this.insert = insert;
    }


    public Insert(int privateData, int protectedData, int defaultData, int publicData) {
        super(privateData, protectedData, defaultData, publicData);
    }
}
