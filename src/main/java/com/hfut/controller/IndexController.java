package com.hfut.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {

    public void index() {
        renderTemplate("index.html");
    }

}
