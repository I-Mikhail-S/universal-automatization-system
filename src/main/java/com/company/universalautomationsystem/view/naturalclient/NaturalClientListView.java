package com.company.universalautomationsystem.view.naturalclient;

import com.company.universalautomationsystem.entity.NaturalClient;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "naturalClients", layout = MainView.class)
@ViewController("NaturalClient.list")
@ViewDescriptor("natural-client-list-view.xml")
@LookupComponent("naturalClientsDataGrid")
@DialogMode(width = "64em")
public class NaturalClientListView extends StandardListView<NaturalClient> {
}