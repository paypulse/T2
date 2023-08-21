package com.example.t2_step1.Gallery;


import com.example.t2_step1.Common.CommonRes;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GalleryApi {

    @Operation(summary = "Api조회 후 insert")
    @PostMapping("/initData")
    public ResponseEntity<CommonRes> initData(){





        return ResponseEntity.ok(CommonRes.builder()
                .status("FAIL")
                .msg("no file")
                .build());
    }



}
