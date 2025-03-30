package pzks.edu.anetrebin.kcos;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kc")
public class Controller {

    @GetMapping("/hello/user")
    @PreAuthorize("hasRole('client_user')")
    public String helloUser() {
        return "Hello User!";
    }

    @GetMapping("/hello/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String helloAdmin() {
        return "Hello Admin!";
    }

    @GetMapping("/hello/unknown")
    public String helloUnknown() {
        return "Hello Unknown!";
    }
}
