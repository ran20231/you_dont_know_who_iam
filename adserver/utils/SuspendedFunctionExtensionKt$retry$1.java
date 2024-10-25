package com.forsale.adserver.utils;

import com.github.mikephil.charting.utils.Utils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SuspendedFunctionExtension.kt */
@d(c = "com.forsale.adserver.utils.SuspendedFunctionExtensionKt", f = "SuspendedFunctionExtension.kt", l = {27, 31, 34}, m = "retry")
/* loaded from: classes2.dex */
public final class SuspendedFunctionExtensionKt$retry$1<T> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    long f20856a;

    /* renamed from: b  reason: collision with root package name */
    double f20857b;

    /* renamed from: c  reason: collision with root package name */
    Object f20858c;

    /* renamed from: d  reason: collision with root package name */
    Object f20859d;

    /* renamed from: e  reason: collision with root package name */
    int f20860e;

    /* renamed from: f  reason: collision with root package name */
    int f20861f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f20862g;

    /* renamed from: h  reason: collision with root package name */
    int f20863h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SuspendedFunctionExtensionKt$retry$1(zz.a<? super SuspendedFunctionExtensionKt$retry$1> aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20862g = obj;
        this.f20863h |= Integer.MIN_VALUE;
        return SuspendedFunctionExtensionKt.a(0, 0L, 0L, Utils.DOUBLE_EPSILON, null, this);
    }
}
