package com.javarush.task1631;

import com.javarush.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        ImageReader reader = null;
        if ((imageTypes != ImageTypes.JPG)&&(imageTypes != ImageTypes.BMP)&&(imageTypes != ImageTypes.PNG))

               throw new IllegalArgumentException("Неизвестный тип картинки");

        if (imageTypes == ImageTypes.JPG)
        reader = new JpgReader();
        if (imageTypes == ImageTypes.BMP)
            reader = new BmpReader();
        if (imageTypes == ImageTypes.PNG)
            reader = new PngReader();
    return reader;
    }
}
