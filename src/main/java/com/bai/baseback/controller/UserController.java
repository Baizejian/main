package com.bai.baseback.controller;


import com.bai.baseback.request.AddValidationGroup;
import com.bai.baseback.request.EditValidationGroup;
import com.bai.baseback.request.UserParam;
import com.bai.baseback.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("Add/Edit User")
    @PostMapping("add")
    public ResponseEntity<UserParam> add(@Validated(AddValidationGroup.class) @RequestBody UserParam userParam) {

        return ResponseEntity.ok(userParam);

    }


    @PostMapping("edit")
    public  ResponseEntity<UserParam> list(@Validated(EditValidationGroup.class) @RequestBody UserParam userParam) {
        return ResponseEntity.ok(userParam);
    }
}
