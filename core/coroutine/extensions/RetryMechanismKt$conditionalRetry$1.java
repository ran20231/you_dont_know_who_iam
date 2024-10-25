package com.forsale.core.coroutine.extensions;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RetryMechanism.kt */
@d(c = "com.forsale.core.coroutine.extensions.RetryMechanismKt", f = "RetryMechanism.kt", l = {FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 115, 116, 131}, m = "conditionalRetry")
/* loaded from: classes3.dex */
public final class RetryMechanismKt$conditionalRetry$1<T> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    int f40603a;

    /* renamed from: b  reason: collision with root package name */
    int f40604b;

    /* renamed from: c  reason: collision with root package name */
    int f40605c;

    /* renamed from: d  reason: collision with root package name */
    int f40606d;

    /* renamed from: e  reason: collision with root package name */
    long f40607e;

    /* renamed from: f  reason: collision with root package name */
    long f40608f;

    /* renamed from: g  reason: collision with root package name */
    Object f40609g;

    /* renamed from: h  reason: collision with root package name */
    Object f40610h;

    /* renamed from: i  reason: collision with root package name */
    Object f40611i;

    /* renamed from: j  reason: collision with root package name */
    Object f40612j;

    /* renamed from: x  reason: collision with root package name */
    Object f40613x;

    /* renamed from: y  reason: collision with root package name */
    /* synthetic */ Object f40614y;

    /* renamed from: z  reason: collision with root package name */
    int f40615z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RetryMechanismKt$conditionalRetry$1(a<? super RetryMechanismKt$conditionalRetry$1> aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40614y = obj;
        this.f40615z |= Integer.MIN_VALUE;
        return RetryMechanismKt.a(0, 0L, 0L, 0, null, null, null, null, this);
    }
}
