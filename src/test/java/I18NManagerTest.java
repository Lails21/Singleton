package test.java;

import main.java.I18NManager;
import org.junit.Assert;
import org.junit.Test;

public class I18NManagerTest {


    @Test
    public void GetTextTest (){
        I18NManager im = I18NManager.getInstance();
        Assert.assertEquals("Hola", im.getText("ca", "l1"));
    }
}


