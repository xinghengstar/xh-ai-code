package com.xh.xhaicode.controller;

import com.xh.xhaicode.common.BaseResponse;
import com.xh.xhaicode.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @RequestMapping("/check")
    public BaseResponse<String> checkHeath(){
        return ResultUtils.success("ok");
    }

}
