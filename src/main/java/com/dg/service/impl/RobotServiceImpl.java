package com.dg.service.impl;

import com.dg.service.RobotService;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RobotServiceImpl implements RobotService {

    public static final MediaType MEDIA_TYPE = MediaType.Companion.parse("application/json;charset=utf-8");

    @Override
    public void sendMessage(String message, String key) {
        String url = "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=" + key;
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody stringBody = RequestBody.Companion.create(message, MEDIA_TYPE);
        Request request = new Request
                .Builder()
                .url(url)
                .post(stringBody)
                .build();
        try {
            okHttpClient.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
