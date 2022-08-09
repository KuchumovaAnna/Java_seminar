import java.io.FileWriter;

public class dz6 {

    public static void main(String[] args) throws Exception
    {
       String csv = "test.csv";
       CSVWriter writer = new CSVWriter(new FileWriter(csv));
       String [] record = "22, 33, 444".split(";");
       writer.writeNext(record);
       
       writer.close();
    }
}