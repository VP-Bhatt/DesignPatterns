package design.pattern;

public class InfoLogProcessor extends LogProcessor{


    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == INFO){
            System.out.println(msg);
        }
        else{
            super.log(logLevel,msg);
        }
    }
}
