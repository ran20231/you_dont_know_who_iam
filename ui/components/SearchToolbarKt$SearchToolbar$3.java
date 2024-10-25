package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import w.t;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchToolbar.kt */
/* loaded from: classes3.dex */
public final class SearchToolbarKt$SearchToolbar$3 extends Lambda implements q<t, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f42366a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42367b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchToolbarKt$SearchToolbar$3(g00.a<p> aVar, int i11) {
        super(3);
        this.f42366a = aVar;
        this.f42367b = i11;
    }

    public final void b(t NavBarInner, a aVar, int i11) {
        o.i(NavBarInner, "$this$NavBarInner");
        if ((i11 & 81) == 16 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1174787318, i11, -1, "com.forsale.ui.components.SearchToolbar.<anonymous> (SearchToolbar.kt:73)");
        }
        ButtonsKt.k(this.f42366a, null, ButtonData.f40994a.c(), false, false, null, ComposableSingletons$SearchToolbarKt.f42288a.a(), aVar, ((this.f42367b >> 6) & 14) | 1572864 | (ButtonData.f40995b << 6), 58);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(t tVar, a aVar, Integer num) {
        b(tVar, aVar, num.intValue());
        return p.f75480a;
    }
}
