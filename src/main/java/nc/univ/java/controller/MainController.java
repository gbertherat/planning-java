package nc.univ.java.controller;

import nc.univ.java.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

@Controller
class MainController {
    @Autowired
    private Service service;

    @GetMapping(path = "")
    public String getIndex() {
        return "index";
    }

    @GetMapping(path = "/test")
    public String launchTest() throws SQLException {
        service.printDatabaseDetail();
        service.printDatabaseContent();
        return "index";
    }

    @GetMapping(path = "/error")
    public String error() {
        return "error";
    }
}
