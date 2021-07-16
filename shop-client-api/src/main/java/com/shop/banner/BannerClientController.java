package com.shop.banner;

import com.shop.banner.dto.BannerClientResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BannerClientController {

    private final BannerClientService bannerClientService;

    @GetMapping("/api/v1/banner")
    public List<BannerClientResponseDto> findUseBannerList() {
        return bannerClientService.findUseBannerList();
    }
}
