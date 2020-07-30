package com.greenfoxacademy.urlaliaser.controllers;

import com.greenfoxacademy.urlaliaser.models.Alias;
import com.greenfoxacademy.urlaliaser.modelsDTO.AliasDTO;
import com.greenfoxacademy.urlaliaser.services.AliasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class AliasRestController {

    AliasService aliasService;

    public AliasRestController(AliasService aliasService) {
        this.aliasService = aliasService;
    }

    @GetMapping (value = "/api/links")
    public ResponseEntity<?> showEntries () {
        List<AliasDTO> show = this.aliasService.getAllAliasesDTO();
        return new ResponseEntity<>(show, HttpStatus.OK);
    }

    @DeleteMapping (value = "/api/links/{id}")
    public ResponseEntity<?> deleteLink (@RequestBody Alias alias, @PathVariable Long id) {
        return this.aliasService.getResponseEntityDelete(id,alias);
    }

}
