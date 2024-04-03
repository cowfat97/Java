package org.myself.code.controller;

import org.myself.code.vo.UserVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author haoxinlei
 */
@RestController
public class InputController {

    @GetMapping("/getData")
    public String getData(@RequestParam("id") String id) {
        String response = "{\"receivedId\": \"" + id + "\"}";
        return response;
    }

    @PostMapping("/addData")
    public String addData(@RequestBody @Validated UserVo userVo) {
        return "response";
    }

}
