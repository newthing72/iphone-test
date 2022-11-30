package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class IOSLauncher extends IOSApplication.Delegate {
    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();

        ApplicationAdapter applicationAdapter = new ApplicationAdapter(){
            @Override
            public void render() {
                System.out.println("lol");
            }
        };

        System.out.println("andrew here");

        return new IOSApplication(applicationAdapter, config);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }
}
