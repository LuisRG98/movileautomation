package controlAppium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.net.MalformedURLException;

public class TextBox extends Control{
    public TextBox(By locator) {
        super(locator);
    }

    public void setValue(String value) throws MalformedURLException {
        this.findControl();
        this.control.clear();
        this.control.sendKeys(value);
    }

    public void modifyValue(String value) throws MalformedURLException {
        this.findControl();
        String oldValue = this.control.getText();
        this.control.sendKeys(oldValue+" "+ value);
    }

}