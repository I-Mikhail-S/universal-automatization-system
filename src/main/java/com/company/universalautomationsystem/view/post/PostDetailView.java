package com.company.universalautomationsystem.view.post;

import com.company.universalautomationsystem.entity.Post;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "posts/:id", layout = MainView.class)
@ViewController("Post.detail")
@ViewDescriptor("post-detail-view.xml")
@EditedEntityContainer("postDc")
public class PostDetailView extends StandardDetailView<Post> {
}