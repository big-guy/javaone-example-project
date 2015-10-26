package javaone;

import java.util.ResourceBundle;

public class ApplicationProperties {
    private final ResourceBundle appResourceBundle;

    private ApplicationProperties(ResourceBundle appResourceBundle) {
        this.appResourceBundle = appResourceBundle;
    }

    public static ApplicationProperties forApp(String appName) {
        ResourceBundle appResourceBundle = ResourceBundle.getBundle(appName);
        return new ApplicationProperties(appResourceBundle);
    }

    public String getVersion() {
        return appResourceBundle.getString("appVersion");
    }
}