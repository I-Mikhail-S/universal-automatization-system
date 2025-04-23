package com.company.universalautomationsystem.view.warehouse;

import com.company.universalautomationsystem.entity.Warehouse;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "warehouses", layout = MainView.class)
@ViewController("Warehouse.list")
@ViewDescriptor("warehouse-list-view.xml")
@LookupComponent("warehousesDataGrid")
@DialogMode(width = "64em")
public class WarehouseListView extends StandardListView<Warehouse> {
}