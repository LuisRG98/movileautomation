package activities.whenDo;


import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class SelectScreen {
    public Label selectBT = new Label(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout"));
    public Button turnBT = new Button(By.id("com.android.settings:id/switch_widget"));

    public SelectScreen(){}
}


