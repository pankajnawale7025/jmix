package com.company.jmixpractise.view.category;

import com.company.jmixpractise.dto.Category;
import com.company.jmixpractise.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.LoadContext;
import io.jmix.flowui.view.*;

import java.util.Collections;
import java.util.List;

@Route(value = "categories", layout = MainView.class)
@ViewController("jmix_Category.list")
@ViewDescriptor("category-list-view.xml")
@LookupComponent("categoriesDataGrid")
@DialogMode(width = "50em")
public class CategoryListView extends StandardListView<Category> {

    @Install(to = "categoriesDl", target = Target.DATA_LOADER)
    protected List<Category> categoriesDlLoadDelegate(LoadContext<Category> loadContext) {
        // Here you can load entities from an external store
        return Collections.emptyList();
    }
}
