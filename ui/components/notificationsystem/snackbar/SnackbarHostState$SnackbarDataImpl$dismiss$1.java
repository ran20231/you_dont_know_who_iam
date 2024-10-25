package com.forsale.ui.components.notificationsystem.snackbar;

import com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnackbarHost.kt */
@d(c = "com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState$SnackbarDataImpl", f = "SnackbarHost.kt", l = {95}, m = "dismiss")
/* loaded from: classes3.dex */
public final class SnackbarHostState$SnackbarDataImpl$dismiss$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f42738a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f42739b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SnackbarHostState.SnackbarDataImpl f42740c;

    /* renamed from: d  reason: collision with root package name */
    int f42741d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$SnackbarDataImpl$dismiss$1(SnackbarHostState.SnackbarDataImpl snackbarDataImpl, a<? super SnackbarHostState$SnackbarDataImpl$dismiss$1> aVar) {
        super(aVar);
        this.f42740c = snackbarDataImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f42739b = obj;
        this.f42741d |= Integer.MIN_VALUE;
        return this.f42740c.c(0, this);
    }
}
