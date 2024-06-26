package org.zkoss.zk.util;

import org.zkoss.lang.Strings;
import org.zkoss.zk.ui.*;
import org.zkoss.zul.impl.LabelImageElement;

public class SclassHelper {
    /**
     * switch the sclass of the component between sclass1 and sclass2
     * @param component the component to toggle
     * @param sclass1 the first sclass
     * @param sclass2 the second sclass
     */
    public static void toggle(HtmlBasedComponent component, String sclass1, String sclass2 ){
        if (component.getSclass() != null && component.getSclass().contains(sclass1)) {
            component.removeSclass(sclass1);
            component.addSclass(sclass2);
        } else {
            component.removeSclass(sclass2);
            component.addSclass(sclass1);
        }
    }

    public static void toggle(HtmlBasedComponent component, String sclass){
        toggle(component, sclass, "");
    }

    public static void toggleIconSclass(LabelImageElement component, String class1, String class2){
        String iconSclass = component.getIconSclass();
        if (iconSclass != null && iconSclass.contains(class1)) {
            removeIconSclass(component, class1);
            addIconSclass(component, class2);
        } else{
            removeIconSclass(component, class2);
            addIconSclass(component, class1);
        }
    }


    public static void addIconSclass(LabelImageElement component, String cssClass) {
        if (Strings.isEmpty(cssClass)) return;

        String iconSclass = component.getIconSclass();
        if (iconSclass == null) {
            component.setIconSclass(cssClass);
            return;
        }

        String[] inputClasses = cssClass.split(" ");
        for (String inputClass : inputClasses) {
            if (!iconSclass.contains(inputClass)) {
                iconSclass += " " + inputClass;
            }
        }
        component.setIconSclass(iconSclass.trim());
    }

    public static void removeIconSclass(LabelImageElement component, String cssClass) {
        String sclass = component.getIconSclass();
        if (sclass != null) {
            String[] inputClasses = cssClass.split(" ");
            for (String inputClass : inputClasses) {
                sclass = sclass.replace(inputClass, "");
            }
            component.setIconSclass(sclass.trim());
        }
    }
}
