package com.javarush.task1631;

import com.javarush.task1631.common.ImageReader;
import com.javarush.task1631.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
