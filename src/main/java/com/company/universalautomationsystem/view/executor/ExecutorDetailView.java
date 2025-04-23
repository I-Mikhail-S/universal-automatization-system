package com.company.universalautomationsystem.view.executor;

import com.company.universalautomationsystem.entity.Executor;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "executors/:id", layout = MainView.class)
@ViewController("Executor.detail")
@ViewDescriptor("executor-detail-view.xml")
@EditedEntityContainer("executorDc")
public class ExecutorDetailView extends StandardDetailView<Executor> {
}