package com.forsale.ui.components.notificationsystem.snackbar;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnackbarHost.kt */
/* loaded from: classes3.dex */
public final class SnackbarHostKt$SnackbarHost$5 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SnackbarHostState f42722a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f42723b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42724c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f42725d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$5(SnackbarHostState snackbarHostState, c cVar, int i11, int i12) {
        super(2);
        this.f42722a = snackbarHostState;
        this.f42723b = cVar;
        this.f42724c = i11;
        this.f42725d = i12;
    }

    public final void b(a aVar, int i11) {
        SnackbarHostKt.a(this.f42722a, this.f42723b, aVar, v0.a(this.f42724c | 1), this.f42725d);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
