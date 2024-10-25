package com.forsale.app.ui.bottomsheets.logout.interactors;

import com.google.android.gms.common.ConnectionResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogoutInteractor.kt */
@d(c = "com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor", f = "LogoutInteractor.kt", l = {22, ConnectionResult.API_DISABLED, 24}, m = "logout")
/* loaded from: classes3.dex */
public final class LogoutInteractor$logout$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f38928a;

    /* renamed from: b  reason: collision with root package name */
    Object f38929b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f38930c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LogoutInteractor f38931d;

    /* renamed from: e  reason: collision with root package name */
    int f38932e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutInteractor$logout$1(LogoutInteractor logoutInteractor, a<? super LogoutInteractor$logout$1> aVar) {
        super(aVar);
        this.f38931d = logoutInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.f38930c = obj;
        this.f38932e |= Integer.MIN_VALUE;
        d11 = this.f38931d.d(this);
        return d11;
    }
}
