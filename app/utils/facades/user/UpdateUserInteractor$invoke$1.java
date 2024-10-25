package com.forsale.app.utils.facades.user;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdateUserInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.UpdateUserInteractor", f = "UpdateUserInteractor.kt", l = {PinConfig.BITMAP_LENGTH_DP, 44, 45}, m = "invoke")
/* loaded from: classes3.dex */
public final class UpdateUserInteractor$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40220a;

    /* renamed from: b  reason: collision with root package name */
    Object f40221b;

    /* renamed from: c  reason: collision with root package name */
    Object f40222c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f40223d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ UpdateUserInteractor f40224e;

    /* renamed from: f  reason: collision with root package name */
    int f40225f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserInteractor$invoke$1(UpdateUserInteractor updateUserInteractor, a<? super UpdateUserInteractor$invoke$1> aVar) {
        super(aVar);
        this.f40224e = updateUserInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40223d = obj;
        this.f40225f |= Integer.MIN_VALUE;
        return this.f40224e.h(null, this);
    }
}
