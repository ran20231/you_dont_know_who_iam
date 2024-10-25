package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.buttons.ButtonsKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchToolbar.kt */
/* loaded from: classes3.dex */
public final class SearchToolbarKt$SearchToolbar$9 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42381a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42382b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchToolbarKt$SearchToolbar$9(g00.a<wz.p> aVar, int i11) {
        super(2);
        this.f42381a = aVar;
        this.f42382b = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-47682403, i11, -1, "com.forsale.ui.components.SearchToolbar.<anonymous> (SearchToolbar.kt:172)");
        }
        ButtonsKt.g(this.f42381a, null, false, null, null, ComposableSingletons$SearchToolbarKt.f42288a.b(), aVar, ((this.f42382b >> 6) & 14) | 196608, 30);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
