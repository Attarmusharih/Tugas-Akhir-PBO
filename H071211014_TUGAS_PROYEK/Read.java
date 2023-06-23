public class Read extends Data{

   String Read;
   public int readData;
    

    public String getRead() {
    return Read;
}


public void setRead(String read) {
    Read = read;
}


public int getReadData() {
    return readData;
}


public void setReadData(int readData) {
    this.readData = readData;
}


public Read(int privateData, int protectedData, int defaultData, int publicData, String read, int readData) {
    super(privateData, protectedData, defaultData, publicData);
    Read = read;
    this.readData = readData;
}


public Read(int privateData, int protectedData, int defaultData, int publicData) {
    super(privateData, protectedData, defaultData, publicData);
    
}

    
}
