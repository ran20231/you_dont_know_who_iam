package com.forsale.app.utils.prefUtils;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataStoreExtensions.kt */
@d(c = "com.forsale.app.utils.prefUtils.DataStoreExtensionsKt", f = "DataStoreExtensions.kt", l = {79}, m = "getValue")
/* loaded from: classes3.dex */
public final class DataStoreExtensionsKt$getValue$1<T> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40421a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40422b;

    /* renamed from: c  reason: collision with root package name */
    int f40423c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataStoreExtensionsKt$getValue$1(a<? super DataStoreExtensionsKt$getValue$1> aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40422b = obj;
        this.f40423c |= Integer.MIN_VALUE;
        return DataStoreExtensionsKt.a(null, null, null, this);
    }
}
