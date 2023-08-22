package com.example.t2_step1.Gallery.Controller;


import com.example.t2_step1.Common.CommonRes;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import static com.example.t2_step1.Common.Utils.InitData;


@Controller
public class GalleryApi {


    @Value("${openApi.sample.url}")
    private  String realUrl;

    @Value("${openApi.sample.serviceKey}")
    private String serviceKey;

    @Value("${openApi.sample.mobileOs}")
    private String mobileOs;

    @Value("${openApi.sample.mobileApp}")
    private String mobileApp;



    @Operation(summary = "Api조회 후 insert")
    @PostMapping("/initData")
    public ResponseEntity<CommonRes> initData(){


        //data api call
        InitData(realUrl, serviceKey, mobileOs, mobileApp);



        return ResponseEntity.ok(CommonRes.builder()
                .status("FAIL")
                .msg("no file")
                .build());
    }



}
