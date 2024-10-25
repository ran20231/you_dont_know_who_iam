package com.forsale.app.utils;

import android.app.Activity;
import android.graphics.Bitmap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f40326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f40327b;

    public /* synthetic */ k(Activity activity, Bitmap bitmap) {
        this.f40326a = activity;
        this.f40327b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContextExtensionsKt$saveImageByUrl$1.b(this.f40326a, this.f40327b);
    }
}
