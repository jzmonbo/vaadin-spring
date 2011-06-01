/*
 * Copyright 2011 Navin Peiris <navin.peiris@gmail.com>, Melbourne, Australia.
 * All Rights Reserved.
 */

package com.navinpeiris.vaadin_spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

/**
 * The main window for the demo.
 * 
 * @author Navin Peiris
 * @since 1.0.0
 */
@Component
@Scope("session")
public class MainWindow extends Window {

    private static final long serialVersionUID = 1L;

    public MainWindow() {
        super(VaadinSpringDemoApplication.APPLICATION_TITLE);

        final Label label = new Label(VaadinSpringDemoApplication.APPLICATION_TITLE);

        addComponent(label);
    }
}
