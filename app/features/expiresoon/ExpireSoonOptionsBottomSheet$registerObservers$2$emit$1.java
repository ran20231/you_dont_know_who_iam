package com.forsale.app.features.expiresoon;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonOptionsBottomSheet.kt */
@d(c = "com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$registerObservers$2", f = "ExpireSoonOptionsBottomSheet.kt", l = {l8.a.f62266c}, m = "emit")
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsBottomSheet$registerObservers$2$emit$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f31248a;

    /* renamed from: b  reason: collision with root package name */
    Object f31249b;

    /* renamed from: c  reason: collision with root package name */
    Object f31250c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f31251d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ExpireSoonOptionsBottomSheet$registerObservers$2 f31252e;

    /* renamed from: f  reason: collision with root package name */
    int f31253f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonOptionsBottomSheet$registerObservers$2$emit$1(ExpireSoonOptionsBottomSheet$registerObservers$2 expireSoonOptionsBottomSheet$registerObservers$2, zz.a<? super ExpireSoonOptionsBottomSheet$registerObservers$2$emit$1> aVar) {
        super(aVar);
        this.f31252e = expireSoonOptionsBottomSheet$registerObservers$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31251d = obj;
        this.f31253f |= Integer.MIN_VALUE;
        return this.f31252e.emit(null, this);
    }
}
