package main.java;
import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    private HashMap<String, ResourceBundle> map;

    private I18NManager() {
        this.map = new HashMap<String, ResourceBundle>();
    }

    public static I18NManager getInstance() {
        if (instance == null) instance = new I18NManager();
        return instance;
    }

    public String getText(String language, String key) {
        ResourceBundle rb = this.map.get(language);
        if (rb == null) {
            rb = ResourceBundle.getBundle(language);
            this.map.put(language, rb);
        }
        return rb.getString(key);
    }

}
