package com.company.universalautomationsystem.view.stuff;

import com.company.universalautomationsystem.entity.Stuff;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "stuffs/:id", layout = MainView.class)
@ViewController("Stuff.detail")
@ViewDescriptor("stuff-detail-view.xml")
@EditedEntityContainer("stuffDc")
public class StuffDetailView extends StandardDetailView<Stuff> {
}