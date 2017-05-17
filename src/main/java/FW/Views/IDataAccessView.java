package FW.Views;

import javax.swing.*;
import java.util.HashMap;

/**
 * Created by Sanjeev on 2/7/2017.
 */
public interface IDataAccessView {
    void setData(HashMap<String, String> data);
    JFrame getParentFrame();
}
