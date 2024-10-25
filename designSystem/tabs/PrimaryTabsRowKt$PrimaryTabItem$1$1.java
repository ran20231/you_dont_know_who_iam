package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTabsRow.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabsRowKt$PrimaryTabItem$1$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ck.a f42091a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryTabsRowKt$PrimaryTabItem$1$1(ck.a aVar) {
        super(2);
        this.f42091a = aVar;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1863207476, i11, -1, "com.forsale.designSystem.tabs.PrimaryTabItem.<anonymous>.<anonymous> (PrimaryTabsRow.kt:148)");
        }
        TextKt.a(this.f42091a.a(), null, 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar, 6).n(), 0L, 0, aVar, 0, 0, 1790);
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
