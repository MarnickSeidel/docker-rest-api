package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@Controller
@RequestMapping(path = "/book")
@ResponseBody
public class RestController {

    @Autowired
    private final RestService restService;

    public RestController(RestService restService) {
        this.restService = restService;
    }

    @RequestMapping(value = "data", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity onResRequest(@RequestParam(value = "id") String id){
        Long Id = Long.parseLong(id);
        return ResponseEntity.ok(restService.getBookStats(Id));
    }

    @PostMapping("/test")
    public ResponseEntity addBook(@RequestBody BookEntity book){
        System.out.println(book.getAuthor() + book.getTitle());
        restService.addBook(book);
        return  ResponseEntity.ok().build();
    }
}
