package com.forsale.app.utils.composeUtils;

import android.view.View;
import androidx.core.view.z0;
import g00.a;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewInteropNestedScrollConnection.kt */
/* loaded from: classes3.dex */
public final class ViewInteropNestedScrollConnection$viewHelper$2 extends Lambda implements a<z0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewInteropNestedScrollConnection f40104a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewInteropNestedScrollConnection$viewHelper$2(ViewInteropNestedScrollConnection viewInteropNestedScrollConnection) {
        super(0);
        this.f40104a = viewInteropNestedScrollConnection;
    }

    @Override // g00.a
    /* renamed from: b */
    public final z0 invoke() {
        View view;
        view = this.f40104a.f40100a;
        z0 z0Var = new z0(view);
        z0Var.m(true);
        return z0Var;
    }
}
