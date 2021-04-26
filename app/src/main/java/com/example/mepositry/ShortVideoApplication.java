package com.example.mepositry;

        import android.app.Application;
        import android.content.Context;

        import com.qiniu.pili.droid.shortvideo.PLShortVideoEnv;

        import org.lasque.tusdk.core.TuSdk;

public class ShortVideoApplication extends Application {
    private Context context;

    private static ShortVideoApplication INSTANCE;

    public static ShortVideoApplication getInstance(){
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // init resources needed by short video sdk
        INSTANCE = this;
        context = getApplicationContext();
        PLShortVideoEnv.init(getApplicationContext());
        TuSdk.enableDebugLog(false);
        TuSdk.init(this, "8bc75f9615741199-06-d7yzs1");

    }
    public Context getContext(){
        return context;
    }
}
