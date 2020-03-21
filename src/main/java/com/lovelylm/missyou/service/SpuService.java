package com.lovelylm.missyou.service;
import com.lovelylm.missyou.model.Spu;
import com.lovelylm.missyou.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Created by LovelyLM
 * 2020/3/20 15:26
 */
@Service
public class SpuService {
    @Autowired
    private SpuRepository spuRepository;

    public Spu getSpu(Long id){
        return this.spuRepository.findOneById(id);
    }

    public Page<Spu> getLatestPagingSpu(Integer pageNum, Integer size){
        PageRequest page = PageRequest.of(pageNum, size, Sort.by("createTime").descending());
        return spuRepository.findAll(page);
    }

    public Page<Spu> getByCategory(Long id, Boolean isRoot, Integer pageNum, Integer size){
        Pageable page = PageRequest.of(pageNum,size);
        if (isRoot){
            return spuRepository.findByRootCategoryIdOrderByCreateTime(id, page);
        }
        else {
            return spuRepository.findByCategoryIdOrderByCreateTimeDesc(id, page);
        }
    }
}
