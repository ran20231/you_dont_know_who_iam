package com.forsale.designSystem.notificationsystem;

import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
public final class SnackbarKt$Snackbar$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak.a f41980a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f41981b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f41982c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41983d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41984e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$2(ak.a aVar, c cVar, float f11, int i11, int i12) {
        super(2);
        this.f41980a = aVar;
        this.f41981b = cVar;
        this.f41982c = f11;
        this.f41983d = i11;
        this.f41984e = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        SnackbarKt.b(this.f41980a, this.f41981b, this.f41982c, aVar, v0.a(this.f41983d | 1), this.f41984e);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
