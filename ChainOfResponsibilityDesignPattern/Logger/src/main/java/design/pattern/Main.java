package design.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessorObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessorObject.log(1, "print this info");
        logProcessorObject.log(2, "Print this debug");
        logProcessorObject.log(3, "Print this error");
    }
}