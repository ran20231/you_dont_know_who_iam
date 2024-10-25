package com.forsale.designSystem.notificationsystem;

import androidx.compose.runtime.c;
import com.forsale.designSystem.notificationsystem.a;
import g00.p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
final class SnackbarKt$Snackbar$1$1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak.a f41978a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41979b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$1$1$1(ak.a aVar, int i11) {
        super(2);
        this.f41978a = aVar;
        this.f41979b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-2147112588, i11, -1, "com.forsale.designSystem.notificationsystem.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:53)");
        }
        a d11 = this.f41978a.d();
        if (o.d(d11, a.c.f41995a)) {
            aVar.C(-607283675);
            SnackbarKt.d(this.f41978a.h(), this.f41978a.g(), aVar, 0);
            aVar.S();
        } else if (o.d(d11, a.b.f41994a)) {
            aVar.C(-607283576);
            SnackbarKt.a(this.f41978a, aVar, this.f41979b & 14);
            aVar.S();
        } else if (o.d(d11, a.C0470a.f41993a)) {
            aVar.C(-607283510);
            SnackbarKt.c(this.f41978a, aVar, this.f41979b & 14);
            aVar.S();
        } else {
            aVar.C(-607283471);
            aVar.S();
        }
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
