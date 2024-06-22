package design.pattern;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == DEBUG){
            System.out.println(msg);
        }
        else{
            super.log(logLevel,msg);
        }
    }
}
