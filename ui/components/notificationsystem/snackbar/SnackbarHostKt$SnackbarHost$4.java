package com.forsale.ui.components.notificationsystem.snackbar;

import androidx.compose.runtime.a;
import com.forsale.designSystem.notificationsystem.SnackbarKt;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import q.c;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnackbarHost.kt */
/* loaded from: classes3.dex */
public final class SnackbarHostKt$SnackbarHost$4 extends Lambda implements q<c, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak.a f42721a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$4(ak.a aVar) {
        super(3);
        this.f42721a = aVar;
    }

    public final void b(c AnimatedVisibility, a aVar, int i11) {
        o.i(AnimatedVisibility, "$this$AnimatedVisibility");
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1463168902, i11, -1, "com.forsale.ui.components.notificationsystem.snackbar.SnackbarHost.<anonymous> (SnackbarHost.kt:136)");
        }
        ak.a aVar2 = this.f42721a;
        SnackbarKt.b(aVar2, aVar2.b(), 0.0f, aVar, 8, 4);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(c cVar, a aVar, Integer num) {
        b(cVar, aVar, num.intValue());
        return p.f75480a;
    }
}
