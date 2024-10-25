package com.forsale.app.analytics.base;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppInfoInteractor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.analytics.base.AppInfoInteractor", f = "AppInfoInteractor.kt", l = {ConnectionResult.API_DISABLED, PinConfig.BITMAP_WIDTH_DP}, m = "invoke")
/* loaded from: classes2.dex */
public final class AppInfoInteractor$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f21964a;

    /* renamed from: b  reason: collision with root package name */
    Object f21965b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f21966c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AppInfoInteractor f21967d;

    /* renamed from: e  reason: collision with root package name */
    int f21968e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInfoInteractor$invoke$1(AppInfoInteractor appInfoInteractor, zz.a<? super AppInfoInteractor$invoke$1> aVar) {
        super(aVar);
        this.f21967d = appInfoInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21966c = obj;
        this.f21968e |= Integer.MIN_VALUE;
        return this.f21967d.a(null, this);
    }
}
