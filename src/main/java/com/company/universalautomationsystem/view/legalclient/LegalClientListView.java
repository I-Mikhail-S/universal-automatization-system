package com.company.universalautomationsystem.view.legalclient;

import com.company.universalautomationsystem.entity.LegalClient;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "legalClients", layout = MainView.class)
@ViewController("LegalClient.list")
@ViewDescriptor("legal-client-list-view.xml")
@LookupComponent("legalClientsDataGrid")
@DialogMode(width = "64em")
public class LegalClientListView extends StandardListView<LegalClient> {
}