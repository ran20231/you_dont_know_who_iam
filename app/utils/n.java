package com.forsale.app.utils;

import com.google.android.gms.tasks.OnFailureListener;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f40371a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g00.l f40372b;

    public /* synthetic */ n(String str, g00.l lVar) {
        this.f40371a = str;
        this.f40372b = lVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        DynamicLinksUtils.h(this.f40371a, this.f40372b, exc);
    }
}
