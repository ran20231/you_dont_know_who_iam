package com.forsale.app.features.expiresoon;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonOptionsBottomSheet.kt */
@d(c = "com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$registerObservers$3", f = "ExpireSoonOptionsBottomSheet.kt", l = {62}, m = "emit")
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsBottomSheet$registerObservers$3$emit$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f31255a;

    /* renamed from: b  reason: collision with root package name */
    Object f31256b;

    /* renamed from: c  reason: collision with root package name */
    Object f31257c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f31258d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ExpireSoonOptionsBottomSheet$registerObservers$3 f31259e;

    /* renamed from: f  reason: collision with root package name */
    int f31260f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonOptionsBottomSheet$registerObservers$3$emit$1(ExpireSoonOptionsBottomSheet$registerObservers$3 expireSoonOptionsBottomSheet$registerObservers$3, zz.a<? super ExpireSoonOptionsBottomSheet$registerObservers$3$emit$1> aVar) {
        super(aVar);
        this.f31259e = expireSoonOptionsBottomSheet$registerObservers$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31258d = obj;
        this.f31260f |= Integer.MIN_VALUE;
        return this.f31259e.emit(null, this);
    }
}
