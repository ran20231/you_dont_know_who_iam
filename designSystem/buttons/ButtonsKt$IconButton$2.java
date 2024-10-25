package com.forsale.designSystem.buttons;

import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import w.t;
import wz.p;
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
final class ButtonsKt$IconButton$2 extends Lambda implements q<t, androidx.compose.runtime.a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.p<androidx.compose.runtime.a, Integer, p> f41088a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41089b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsKt$IconButton$2(g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar, int i11) {
        super(3);
        this.f41088a = pVar;
        this.f41089b = i11;
    }

    public final void b(t Button, androidx.compose.runtime.a aVar, int i11) {
        o.i(Button, "$this$Button");
        if ((i11 & 81) == 16 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-785948328, i11, -1, "com.forsale.designSystem.buttons.IconButton.<anonymous> (Buttons.kt:322)");
        }
        this.f41088a.invoke(aVar, Integer.valueOf((this.f41089b >> 15) & 14));
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar, Integer num) {
        b(tVar, aVar, num.intValue());
        return p.f75480a;
    }
}
