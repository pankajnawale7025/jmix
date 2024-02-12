package com.company.jmixpractise.view.categoriesdto;

import com.company.jmixpractise.dto.CategoriesDTO;
import com.company.jmixpractise.view.main.MainView;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "categoriesDTO/detail", layout = MainView.class)
@ViewController("jmix_CategoriesDTO.detail")
@ViewDescriptor("categories-dto-detail-view.xml")
@EditedEntityContainer("categoriesDTODc")
public class CategoriesDTODetailView extends StandardDetailView<CategoriesDTO> {

    @Override
    protected void findEntityId(BeforeEnterEvent event) {
        // Because DTO entity cannot be loaded by Id, we need to prevent Id parsing from route parameters
    }
}
