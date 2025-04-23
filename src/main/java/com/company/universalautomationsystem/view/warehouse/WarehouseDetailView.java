package com.company.universalautomationsystem.view.warehouse;

import com.company.universalautomationsystem.entity.Warehouse;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "warehouses/:id", layout = MainView.class)
@ViewController("Warehouse.detail")
@ViewDescriptor("warehouse-detail-view.xml")
@EditedEntityContainer("warehouseDc")
public class WarehouseDetailView extends StandardDetailView<Warehouse> {
}