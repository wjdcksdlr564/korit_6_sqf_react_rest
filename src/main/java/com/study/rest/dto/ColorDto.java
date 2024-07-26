package com.study.rest.dto;

import com.study.rest.entity.Size;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

public class ColorDto {
    @Builder
    @Data
    public static class Info {
        private int colorId;
        private String colorName;
    }
    public static List<SizeDto.Info> toList(List<Size> colorList) {
        return colorList.stream().map(Size::toDto).collect(Collectors.toList());
    }
}
