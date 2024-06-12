package com.Webtech.Mertcan.demo.Web.api;
import com.Webtech.Mertcan.demo.service.KeyboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
public class KeyboardRestController {

    private final KeyboardService keyboardService;

    public KeyboardRestController(KeyboardService keyboardService) {
        this.keyboardService = keyboardService;
    }

    @GetMapping(path = "/api/v1/keyboards")
    public ResponseEntity<List<Keyboard>> fetchKeyboards() {
        return ResponseEntity.ok(keyboardService.findAll());
    }

    @GetMapping(path = "/api/v1/keyboards/{id}")
    public ResponseEntity<Keyboard> fetchKeyboardById(@PathVariable Long id) {
        var keyboard = keyboardService.findById(id);
        return keyboard != null? ResponseEntity.ok(keyboard) : ResponseEntity.notFound().build();
    }

    @PostMapping(path = "/api/v1/keyboards")
    public ResponseEntity<Void> createKeyboard(@RequestBody KeyboardManipulationRequest request) throws URISyntaxException {
        var keyboard = keyboardService.create(request);
        URI uri = new URI("/api/v1/keyboards/" + keyboard.getId());
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(path = "/api/v1/keyboards/{id}")
    public ResponseEntity<Keyboard> updateKeyboard(@PathVariable Long id, @RequestBody KeyboardManipulationRequest request) {
        var keyboard = keyboardService.update(id, request);
        return keyboard != null? ResponseEntity.ok(keyboard) : ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/api/v1/keyboards/{id}")
    public ResponseEntity<Void> deleteKeyboard(@PathVariable Long id) {
        boolean successful = keyboardService.deleteById(id);
        return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}

