package com.web.site;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.util.ThumbnailatorUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/9/17 14:04
 * @Modified By:
 */
public class ImgThumbNailTest {

    @Test
    public void testThumb(){
        try {
            Thumbnails.of("D:\\test.jpg").scale(0.5).toFile("D:\\test_nail.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

