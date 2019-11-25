package com.example.msi.graphics;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by MSI on 11/25/2019.
 */

public class Graphics extends Activity{
    protected GraphicsView graphicsView=null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        graphicsView=new GraphicsView(this);
        setContentView(graphicsView);

    }

    @Override
    protected void onStop() {
        if(graphicsView!=null)
            graphicsView.StopMedia();
        super.onStop();
    }
}
