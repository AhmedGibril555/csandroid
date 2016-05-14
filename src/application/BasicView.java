package com.gluonapplication22;

import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
public class BasicView extends View {

    public BasicView(String name) {
        super(name);
        CalCulaTor1 cal =new CalCulaTor1();
        setCenter(cal);
    }

    @Override
    protected void updateAppBar(AppBar appBar) {
        appBar.setTitleText("                   CalCulator");
      
       
    }
    
}
