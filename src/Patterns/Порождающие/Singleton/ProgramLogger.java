package Patterns.Порождающие.Singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "logFile";

    public static ProgramLogger getProgramLogger(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
public ProgramLogger(){

}
    public static void addLogInfo(String lofInfo){
        logFile += lofInfo + "\n";
    }
    public static void show(){
        System.out.println(logFile);
    }
}
