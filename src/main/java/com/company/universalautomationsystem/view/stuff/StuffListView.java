package com.company.universalautomationsystem.view.stuff;

import com.company.universalautomationsystem.entity.Stuff;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "stuffs", layout = MainView.class)
@ViewController("Stuff.list")
@ViewDescriptor("stuff-list-view.xml")
@LookupComponent("stuffsDataGrid")
@DialogMode(width = "64em")
public class StuffListView extends StandardListView<Stuff> {
}