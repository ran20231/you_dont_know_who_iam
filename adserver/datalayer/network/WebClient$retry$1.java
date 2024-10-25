package com.forsale.adserver.datalayer.network;

import com.github.mikephil.charting.utils.Utils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebClient.kt */
@d(c = "com.forsale.adserver.datalayer.network.WebClient", f = "WebClient.kt", l = {120, 124, 127}, m = "retry")
/* loaded from: classes2.dex */
public final class WebClient$retry$1<T> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    long f20730a;

    /* renamed from: b  reason: collision with root package name */
    double f20731b;

    /* renamed from: c  reason: collision with root package name */
    Object f20732c;

    /* renamed from: d  reason: collision with root package name */
    Object f20733d;

    /* renamed from: e  reason: collision with root package name */
    int f20734e;

    /* renamed from: f  reason: collision with root package name */
    int f20735f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f20736g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ WebClient f20737h;

    /* renamed from: i  reason: collision with root package name */
    int f20738i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebClient$retry$1(WebClient webClient, a<? super WebClient$retry$1> aVar) {
        super(aVar);
        this.f20737h = webClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20736g = obj;
        this.f20738i |= Integer.MIN_VALUE;
        return this.f20737h.w(0, 0L, 0L, Utils.DOUBLE_EPSILON, null, this);
    }
}
