package com.xworkz.internal;

public class NutriBulletBlender implements Blender {
    public void blend() {
        System.out.println("Blending with NutriBullet blender");
    }
    public void stop() {
        System.out.println("Stopping NutriBullet blender");
    }
    public void adjustSpeed() {
        System.out.println("Adjusting speed on NutriBullet blender");
    }
}
