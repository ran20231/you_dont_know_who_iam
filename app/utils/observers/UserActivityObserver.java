package com.forsale.app.utils.observers;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import com.forsale.app.datalayer.repositories.UserActivityRepository;
import com.forsale.app.utils.observers.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: UserActivityObserver.kt */
/* loaded from: classes3.dex */
public final class UserActivityObserver implements com.forsale.app.utils.observers.a, CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final UserActivityRepository f40382a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f40383b;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(th2.getMessage(), new Object[0]);
        }
    }

    public UserActivityObserver(UserActivityRepository userActivityRepository) {
        o.i(userActivityRepository, "userActivityRepository");
        this.f40382a = userActivityRepository;
        this.f40383b = true;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getIO().plus(new a(CoroutineExceptionHandler.Key));
    }

    @Override // com.forsale.app.utils.observers.a
    public boolean isEnabled() {
        return this.f40383b;
    }

    @d0(Lifecycle.Event.ON_START)
    public final void onMoveToForeground() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new UserActivityObserver$onMoveToForeground$1(this, null), 3, null);
    }

    @Override // com.forsale.app.utils.observers.a
    public void q() {
        a.C0459a.a(this);
    }
}
