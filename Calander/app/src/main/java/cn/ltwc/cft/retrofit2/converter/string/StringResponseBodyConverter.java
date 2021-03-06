package cn.ltwc.cft.retrofit2.converter.string;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * StringResponseBodyConverter
 * Created by LZL on 2017/2/23.
 */
public class StringResponseBodyConverter implements Converter<ResponseBody, String> {
    @Override
    public String convert(ResponseBody value) throws IOException {
        try {
            return value.string();
        } finally {
            value.close();
        }
    }
}
