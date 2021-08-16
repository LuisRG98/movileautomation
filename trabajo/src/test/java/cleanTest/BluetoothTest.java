package cleanTest;

import activities.whenDo.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;


import java.net.MalformedURLException;

public class BluetoothTest {

    private MainScreen mainScreen= new MainScreen();
    private SelectScreen selectScreen= new SelectScreen();
    private ChangeName changeName = new ChangeName();
    private SearchDevices searchDevices = new SearchDevices();

    @Test
    public void verifyCreateTask() throws MalformedURLException, InterruptedException {
        String newName="MyBluetooth";
        String msg = "On";

        mainScreen.search.click();
        mainScreen.connection.click();
        selectScreen.selectBT.click();
        selectScreen.turnBT.click();
        searchDevices.pairDevice.click();
        searchDevices.device.click();
        changeName.nameArea.click();
        changeName.name.setValue(newName);
        changeName.confirm.click();
        searchDevices.back.click();

        Assertions.assertEquals(msg,changeName.on.getText(),"ERROR! Bluetooth is off");
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
