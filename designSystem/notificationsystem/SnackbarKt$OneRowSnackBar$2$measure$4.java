package com.forsale.designSystem.notificationsystem;

import androidx.compose.ui.layout.o0;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
final class SnackbarKt$OneRowSnackBar$2$measure$4 extends Lambda implements l<o0.a, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f41968a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41969b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o0 f41970c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41971d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41972e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackBar$2$measure$4(o0 o0Var, int i11, o0 o0Var2, int i12, int i13) {
        super(1);
        this.f41968a = o0Var;
        this.f41969b = i11;
        this.f41970c = o0Var2;
        this.f41971d = i12;
        this.f41972e = i13;
    }

    public final void b(o0.a layout) {
        o.i(layout, "$this$layout");
        o0.a.j(layout, this.f41968a, 0, this.f41969b, 0.0f, 4, null);
        o0.a.j(layout, this.f41970c, this.f41971d, this.f41972e, 0.0f, 4, null);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(o0.a aVar) {
        b(aVar);
        return p.f75480a;
    }
}
