package com.company.universalautomationsystem.view.product;

import com.company.universalautomationsystem.entity.Product;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "products/:id", layout = MainView.class)
@ViewController("Product.detail")
@ViewDescriptor("product-detail-view.xml")
@EditedEntityContainer("productDc")
public class ProductDetailView extends StandardDetailView<Product> {
}