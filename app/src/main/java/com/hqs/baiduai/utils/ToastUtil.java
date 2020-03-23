package com.hqs.baiduai.utils;

import android.content.Context;
import android.widget.Toast;


/**
 * Created by lcodecore on 2017/2/28.
 */

public class ToastUtil {
    public static void show(Context ctx,String msg){
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
    }
}
