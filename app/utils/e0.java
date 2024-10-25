package com.forsale.app.utils;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.core.view.y f40110a;

    public /* synthetic */ e0(androidx.core.view.y yVar) {
        this.f40110a = yVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return TopLevelUtilityFunctionsKt.h(this.f40110a, view, motionEvent);
    }
}
