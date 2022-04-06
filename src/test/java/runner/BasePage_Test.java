package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.BasePage;

public class BasePage_Test extends Hooks {
    ThreadLocal<BasePage> nombre =ThreadLocal.withInitial(BasePage::new);
    @Test
    public void form(){
        nombre.get().form();
    }

}

