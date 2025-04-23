package com.company.universalautomationsystem.view.naturalclient;

import com.company.universalautomationsystem.entity.NaturalClient;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "naturalClients/:id", layout = MainView.class)
@ViewController("NaturalClient.detail")
@ViewDescriptor("natural-client-detail-view.xml")
@EditedEntityContainer("naturalClientDc")
public class NaturalClientDetailView extends StandardDetailView<NaturalClient> {
}