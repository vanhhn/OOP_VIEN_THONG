import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class AnalysisException extends Exception{
  public AnalysisException(String message) {
    super(message);
  }
}

interface Analyzer{
  long analyze(String filePath) throws IOException,AnalysisException;
  String getAnalysisType();
}

class LineCountAnalyzer implements Analyzer{
  @Override 
  public long analyze(String filePath){
    long lineCount=0;
    try{
      FileReader in = new FileReader(filePath);
      BufferedReader reader = new BufferedReader(in);
      String line = reader.readLine();
      while(line!=null){
        lineCount++;
        line = reader.readLine();
      }
    }catch(FileNotFoundException e){
      System.out.printf("Error: File not found - %s",filePath);
    }
    catch(IOException e){
      System.out.printf("IO problem - %s (%s)",filePath,e.getMessage());
    }
    return lineCount;
  }
  @Override
  public String getAnalysisType(){
    return "";
  }
}
public class EXCEPTION004_Bo_phan_tich {
  public static void main(String[] args) {
    
  }
}