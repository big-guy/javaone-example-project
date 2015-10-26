package javaone;

public class Main {
    public static void main(String[] args) {
        String appName = "app";
        if (args.length >= 1) {
            appName = args[0];
        }
        ApplicationProperties appProperties = ApplicationProperties.forApp(appName);

        System.out.println(String.format("%s version is %s", appName, appProperties.getVersion()));
    }
}
