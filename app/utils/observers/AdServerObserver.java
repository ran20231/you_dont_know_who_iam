package com.forsale.app.utils.observers;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import com.forsale.app.utils.observers.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AdServerObserver.kt */
/* loaded from: classes3.dex */
public final class AdServerObserver implements CoroutineScope, com.forsale.app.utils.observers.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f40375a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f40376b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40377c;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.c(th2);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("AdserverError:" + message, new Object[0]);
        }
    }

    public AdServerObserver(Context context) {
        o.i(context, "context");
        this.f40375a = context;
        this.f40376b = Dispatchers.getIO().plus(new b(CoroutineExceptionHandler.Key));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f40376b;
    }

    @Override // com.forsale.app.utils.observers.a
    public boolean isEnabled() {
        return this.f40377c;
    }

    @d0(Lifecycle.Event.ON_START)
    public final void onMoveToForeground() {
        if (isEnabled()) {
            BuildersKt__Builders_commonKt.launch$default(this, new a(CoroutineExceptionHandler.Key), null, new AdServerObserver$onMoveToForeground$2(this, null), 2, null);
        }
    }

    @Override // com.forsale.app.utils.observers.a
    public void q() {
        a.C0459a.a(this);
    }

    @d0(Lifecycle.Event.ON_STOP)
    public final void onMoveToBackground() {
    }
}
