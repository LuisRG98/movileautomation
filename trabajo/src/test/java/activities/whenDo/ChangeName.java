package activities.whenDo;

import controlAppium.Button;
import controlAppium.Label;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class ChangeName {

    public Label nameArea= new Label(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout"));
    public TextBox name = new TextBox(By.id("com.android.settings:id/edittext"));
    public Button confirm = new Button(By.id("android:id/button1"));
    public Label on = new Label(By.id("com.android.settings:id/switch_text"));

    public ChangeName(){}
}
