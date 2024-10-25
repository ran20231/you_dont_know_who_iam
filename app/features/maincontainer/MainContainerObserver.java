package com.forsale.app.features.maincontainer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import androidx.lifecycle.r;
/* compiled from: MainContainerObserver.kt */
/* loaded from: classes2.dex */
public final class MainContainerObserver implements r {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f31446b;

    /* renamed from: a  reason: collision with root package name */
    public static final MainContainerObserver f31445a = new MainContainerObserver();

    /* renamed from: c  reason: collision with root package name */
    public static final int f31447c = 8;

    private MainContainerObserver() {
    }

    @d0(Lifecycle.Event.ON_CREATE)
    private final void onMainContainerCreated() {
        f31446b = true;
    }

    @d0(Lifecycle.Event.ON_DESTROY)
    private final void onMainContainerDestroyed() {
        f31446b = false;
    }
}
