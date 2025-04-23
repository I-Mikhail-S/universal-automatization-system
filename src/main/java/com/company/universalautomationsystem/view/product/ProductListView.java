package com.company.universalautomationsystem.view.product;

import com.company.universalautomationsystem.entity.Product;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "products", layout = MainView.class)
@ViewController("Product.list")
@ViewDescriptor("product-list-view.xml")
@LookupComponent("productsDataGrid")
@DialogMode(width = "64em")
public class ProductListView extends StandardListView<Product> {
}