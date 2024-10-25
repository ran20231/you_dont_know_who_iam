package com.forsale.app.workmangers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClearListingCachedWorkManger.kt */
@d(c = "com.forsale.app.workmangers.ClearListingCachedWorkManger", f = "ClearListingCachedWorkManger.kt", l = {25}, m = "doWork")
/* loaded from: classes3.dex */
public final class ClearListingCachedWorkManger$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f40557a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ClearListingCachedWorkManger f40558b;

    /* renamed from: c  reason: collision with root package name */
    int f40559c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearListingCachedWorkManger$doWork$1(ClearListingCachedWorkManger clearListingCachedWorkManger, a<? super ClearListingCachedWorkManger$doWork$1> aVar) {
        super(aVar);
        this.f40558b = clearListingCachedWorkManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40557a = obj;
        this.f40559c |= Integer.MIN_VALUE;
        return this.f40558b.a(this);
    }
}
