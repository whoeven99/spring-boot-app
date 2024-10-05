// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.appservice.examples.springbootmongodb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

    private static Logger logger = LoggerFactory.getLogger(TodoListController.class);

    public TodoListController() {
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello";
    }
}
