package com.lovelylm.missyou.api.v1;
import com.lovelylm.missyou.model.Banner;
import com.lovelylm.missyou.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.NotBlank;

/**
 * Created by LovelyLM
 * 2020/3/18 15:30
 */
@RestController
@RequestMapping("/banner")

public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping("/name/{name}")
    public Banner getByName(@PathVariable @NotBlank String name){
        Banner banner = bannerService.getByName(name);
        if (banner == null){
            //抛出异常，Banner类资源不存在
        }
        return banner;
    }
}
