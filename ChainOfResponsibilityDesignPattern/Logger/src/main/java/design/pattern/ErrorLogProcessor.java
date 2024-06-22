package design.pattern;

public class ErrorLogProcessor extends LogProcessor{


    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == ERROR){
            System.out.println(msg);
        }
        else{
            super.log(logLevel,msg);
        }
    }
}
