package com.company.universalautomationsystem.view.legalclient;

import com.company.universalautomationsystem.entity.LegalClient;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "legalClients/:id", layout = MainView.class)
@ViewController("LegalClient.detail")
@ViewDescriptor("legal-client-detail-view.xml")
@EditedEntityContainer("legalClientDc")
public class LegalClientDetailView extends StandardDetailView<LegalClient> {
}