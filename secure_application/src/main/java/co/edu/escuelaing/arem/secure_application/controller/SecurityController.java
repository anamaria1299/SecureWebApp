package co.edu.escuelaing.arem.secure_application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/secure")
public class SecurityController {
    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String getData(@RequestParam String name) {
        System.out.println("Returning data from nt-ms data method");
        return "Hello from NT-MS-data method to person with name ["+name+"]";
    }
}
