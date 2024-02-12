package com.company.jmixpractise.view.categoriesdto;

import com.company.jmixpractise.Service.CategoryService;
import com.company.jmixpractise.dto.CategoriesDTO;
import com.company.jmixpractise.view.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import io.jmix.core.FileRef;
import io.jmix.core.LoadContext;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.List;

@Route(value = "categoriesDToes", layout = MainView.class)
@ViewController("jmix_CategoriesDTO.list")
@ViewDescriptor("categories-dto-list-view.xml")
@LookupComponent("categoriesDToesDataGrid")
@DialogMode(width = "50em")
public class CategoriesDTOListView extends StandardListView<CategoriesDTO> {


    @Autowired
    CategoryService categoryService;

    @ViewComponent
    private CollectionContainer<CategoriesDTO> categoriesDToesDc;
    @ViewComponent
    private DataGrid<CategoriesDTO> dataGrid;

    @Subscribe
    public void onInit(InitEvent event) {
        dataGrid.addColumn(  categoriesDToesDc->new Component() {
                    @Override
                    public Element getElement() {
                        return super.getElement();
                    }
                })
                .setKey("name") // The key is optional, but it's useful for referencing the column later
                .setResizable(true) // Set whether the column is resizable
                .setWidth("150px"); // Set the width of the column
    }









    @Install(to = "categoriesDToesDl", target = Target.DATA_LOADER)
    protected List<CategoriesDTO> categoriesDToesDlLoadDelegate(LoadContext<CategoriesDTO> loadContext) {
        // Here you can load entities from an external store
        return categoryService.getCategories();
    }




}
