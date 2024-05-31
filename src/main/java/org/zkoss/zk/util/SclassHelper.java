package org.zkoss.zk.util;

import org.zkoss.zk.ui.*;

public class SclassHelper {
    /**
     * Toggle the sclass of the component between sclass1 and sclass2
     * @param component the component to toggle
     * @param sclass1 the first sclass
     * @param sclass2 the second sclass
     */
    public static void toggle(HtmlBasedComponent component, String sclass1, String sclass2 ){
        if (component.getSclass().contains(sclass1)) {
            component.removeSclass(sclass1);
            component.addSclass(sclass2);
        } else {
            component.removeSclass(sclass2);
            component.addSclass(sclass1);
        }
    }
}
