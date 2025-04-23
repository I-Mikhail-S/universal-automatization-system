package com.company.universalautomationsystem.view.post;

import com.company.universalautomationsystem.entity.Post;
import com.company.universalautomationsystem.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "posts", layout = MainView.class)
@ViewController("Post.list")
@ViewDescriptor("post-list-view.xml")
@LookupComponent("postsDataGrid")
@DialogMode(width = "64em")
public class PostListView extends StandardListView<Post> {
}