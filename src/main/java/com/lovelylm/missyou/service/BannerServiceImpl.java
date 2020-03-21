package com.lovelylm.missyou.service;

import com.lovelylm.missyou.model.Banner;
import com.lovelylm.missyou.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LovelyLM
 * 2020/3/19 10:24
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerRepository bannerRepository;
    @Override
    public Banner getByName(String name) {
        return bannerRepository.findOneByName(name);
    }
}
