package com.forsale.designSystem.notificationsystem;

import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
public final class SnackbarKt$TwoRowsSnackbar$3 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak.a f41985a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41986b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$TwoRowsSnackbar$3(ak.a aVar, int i11) {
        super(2);
        this.f41985a = aVar;
        this.f41986b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        SnackbarKt.c(this.f41985a, aVar, v0.a(this.f41986b | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
