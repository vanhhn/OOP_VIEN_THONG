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
  long analyze(String filePath){
    
  }
}
public class EXCEPTION004_Bo_phan_tich {
  public static void main(String[] args) {
    
  }
}