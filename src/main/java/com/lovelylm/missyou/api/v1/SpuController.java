package com.lovelylm.missyou.api.v1;
import com.lovelylm.missyou.bo.PageCounter;
import com.lovelylm.missyou.model.Spu;
import com.lovelylm.missyou.service.SpuService;
import com.lovelylm.missyou.util.CommUtil;
import com.lovelylm.missyou.vo.PagingDozer;
import com.lovelylm.missyou.vo.SpuSimplifyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.Positive;

/**
 * Created by LovelyLM
 * 2020/3/18 15:30
 */
@RestController
@RequestMapping("/spu")

public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping("/id/{id}/detail")
    public Spu getDetail(@PathVariable @Positive Long id){
        Spu spu = spuService.getSpu(id);
        if (spu == null){
            //抛出异常，Spu类资源不存在
        }
        return spu;
    }

    @GetMapping("/latest")
    public PagingDozer<Spu, SpuSimplifyVO> getLatestPagingSpu(@RequestParam(defaultValue = "0") Integer start,
                                          @RequestParam(defaultValue = "10") Integer count){
        PageCounter pageCounter = CommUtil.convertToPageParameter(start, count);
        Page<Spu> spuList = spuService.getLatestPagingSpu(pageCounter.getPage(), pageCounter.getCount());
        return new PagingDozer<>(spuList, SpuSimplifyVO.class);
    }

    @GetMapping("/by/category/{id}")
    public PagingDozer<Spu, SpuSimplifyVO> getByCategoryId(@PathVariable @Positive(message = "{id.positive}") Long id,
                                                           @RequestParam(name = "is_root", defaultValue = "false") Boolean isRoot,
                                                           @RequestParam(name = "start", defaultValue = "0") Integer start,
                                                           @RequestParam(name = "count", defaultValue = "10") Integer count){
        PageCounter pageCounter = CommUtil.convertToPageParameter(start, count);
        Page<Spu> page = spuService.getByCategory(id, isRoot, pageCounter.getPage(), pageCounter.getCount());
        return new PagingDozer<>(page, SpuSimplifyVO.class);

    }

}
