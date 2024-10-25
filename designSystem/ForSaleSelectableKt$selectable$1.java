package com.forsale.designSystem;

import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.ui.c;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import q1.i;
import v.j;
import v.k;
import wz.p;
/* compiled from: ForSaleSelectable.kt */
/* loaded from: classes3.dex */
final class ForSaleSelectableKt$selectable$1 extends Lambda implements q<c, androidx.compose.runtime.a, Integer, c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f40661a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f40662b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForSaleSelectableKt$selectable$1(boolean z11, g00.a<p> aVar) {
        super(3);
        this.f40661a = z11;
        this.f40662b = aVar;
    }

    public final c b(c composed, androidx.compose.runtime.a aVar, int i11) {
        o.i(composed, "$this$composed");
        aVar.C(1922257374);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1922257374, i11, -1, "com.forsale.designSystem.selectable.<anonymous> (ForSaleSelectable.kt:13)");
        }
        int e11 = i.f66253b.e();
        aVar.C(-492369756);
        Object D = aVar.D();
        if (D == androidx.compose.runtime.a.f7182a.a()) {
            D = j.a();
            aVar.u(D);
        }
        aVar.S();
        c a11 = SelectableKt.a(composed, this.f40661a, (k) D, null, true, i.h(e11), this.f40662b);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return a11;
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ c invoke(c cVar, androidx.compose.runtime.a aVar, Integer num) {
        return b(cVar, aVar, num.intValue());
    }
}
