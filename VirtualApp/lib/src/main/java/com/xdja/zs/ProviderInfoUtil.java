package com.xdja.zs;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.util.Log;

import com.lody.virtual.client.core.VirtualCore;

/**
 * @Date 19-6-27 11
 * @Author lxf@xdja.com
 * @Descrip:
 */
public class ProviderInfoUtil {

    private static final String TAG = ProviderInfoUtil.class.getName();
    public static String  getProviderInfo(@NonNull Context context){
        try {
            String PROVIDER_KEY = VirtualCore.get().getHostPkg();
            PackageManager pm = context.getPackageManager();
            ApplicationInfo appinfo =  pm.getApplicationInfo(PROVIDER_KEY, PackageManager.GET_META_DATA);
            if(appinfo==null)
                return null;
            String URI = appinfo.metaData.getString(PROVIDER_KEY);
            Log.e(TAG,"URI "+ URI);
            return URI;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}