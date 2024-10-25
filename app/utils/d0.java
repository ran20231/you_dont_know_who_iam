package com.forsale.app.utils;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.core.view.y f40105a;

    public /* synthetic */ d0(androidx.core.view.y yVar) {
        this.f40105a = yVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return TopLevelUtilityFunctionsKt.a(this.f40105a, view, motionEvent);
    }
}
