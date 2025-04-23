package com.company.universalautomationsystem.view.executor;

import com.company.universalautomationsystem.entity.Executor;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "executors", layout = MainView.class)
@ViewController("Executor.list")
@ViewDescriptor("executor-list-view.xml")
@LookupComponent("executorsDataGrid")
@DialogMode(width = "64em")
public class ExecutorListView extends StandardListView<Executor> {
}