package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes2.dex */
public final class InAppRepository$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements CoroutineExceptionHandler {
    public InAppRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key) {
        super(key);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        x10.a.c(th2);
    }
}
