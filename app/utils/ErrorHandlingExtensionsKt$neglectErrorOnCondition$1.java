package com.forsale.app.utils;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorHandlingExtensions.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.ErrorHandlingExtensionsKt", f = "ErrorHandlingExtensions.kt", l = {15}, m = "neglectErrorOnCondition")
/* loaded from: classes3.dex */
public final class ErrorHandlingExtensionsKt$neglectErrorOnCondition$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    boolean f39558a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f39559b;

    /* renamed from: c  reason: collision with root package name */
    int f39560c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ErrorHandlingExtensionsKt$neglectErrorOnCondition$1(zz.a<? super ErrorHandlingExtensionsKt$neglectErrorOnCondition$1> aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39559b = obj;
        this.f39560c |= Integer.MIN_VALUE;
        return ErrorHandlingExtensionsKt.b(false, null, this);
    }
}
