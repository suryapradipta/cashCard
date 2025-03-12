package example.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This tells Spring that this class is a Component of type RestController and capable of handling HTTP requests.
@RestController

//This is a companion to @RestController that indicates which address requests must have to access this Controller.
@RequestMapping("/cashcards")
public class CashCardController {

    // @GetMapping marks a method as a handler method. GET requests that match cashcards/{requestedID} will be handled by this method.
    @GetMapping("/{requestedId}")
    private ResponseEntity<String> findById() {
        return ResponseEntity.ok("{}");
    }
}
