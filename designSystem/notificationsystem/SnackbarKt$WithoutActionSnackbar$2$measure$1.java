package com.forsale.designSystem.notificationsystem;

import androidx.compose.ui.layout.o0;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
final class SnackbarKt$WithoutActionSnackbar$2$measure$1 extends Lambda implements l<o0.a, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f41988a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o0 f41989b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$WithoutActionSnackbar$2$measure$1(int i11, o0 o0Var) {
        super(1);
        this.f41988a = i11;
        this.f41989b = o0Var;
    }

    public final void b(o0.a layout) {
        o.i(layout, "$this$layout");
        o0.a.j(layout, this.f41989b, 0, (this.f41988a - this.f41989b.j0()) / 2, 0.0f, 4, null);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(o0.a aVar) {
        b(aVar);
        return p.f75480a;
    }
}
