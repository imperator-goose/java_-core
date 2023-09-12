package Patterns.Порождающие.Singleton;

import Patterns.Порождающие.Singleton.ProgramLogger;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("AA");

        ProgramLogger.show();
    }
}
