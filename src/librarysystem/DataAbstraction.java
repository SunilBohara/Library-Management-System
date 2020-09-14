package librarysystem;

public abstract class DataAbstraction {
    
    public abstract void connectiontoServer() throws Exception;
    public abstract void iduData(String sqlquery)throws Exception;
    public abstract void closeConnection() throws Exception;
    public abstract void readData(String sqlquery) throws Exception;
}

