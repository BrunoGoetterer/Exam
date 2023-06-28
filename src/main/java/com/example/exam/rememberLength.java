package com.example.exam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rememberLength {

    private String lastModifiedWord = "";
    private int lastModifiedWordLength = 0;

    @GetMapping("/api/modify/length")
    public int getLastModifiedWordLength() {
        return lastModifiedWordLength;
    }

    @GetMapping("/api/modify")
    public String modifyString(@RequestParam String string) {
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                modifiedString.append(Character.toLowerCase(string.charAt(i)));
            } else {
                modifiedString.append(Character.toUpperCase(string.charAt(i)));
            }
        }
        lastModifiedWord = modifiedString.toString();
        lastModifiedWordLength = lastModifiedWord.length();
        return lastModifiedWord;
    }

    public String getLastModifiedWord() {
        return lastModifiedWord;
    }
}
