package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.dividers.DividersKt;
import e2.h;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: PrimaryTabsRow.kt */
/* renamed from: com.forsale.designSystem.tabs.ComposableSingletons$PrimaryTabsRowKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$PrimaryTabsRowKt$lambda1$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$PrimaryTabsRowKt$lambda1$1 f42075a = new ComposableSingletons$PrimaryTabsRowKt$lambda1$1();

    ComposableSingletons$PrimaryTabsRowKt$lambda1$1() {
        super(2);
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1345173011, i11, -1, "com.forsale.designSystem.tabs.ComposableSingletons$PrimaryTabsRowKt.lambda-1.<anonymous> (PrimaryTabsRow.kt:97)");
        }
        DividersKt.a(null, h.l(3), 0L, aVar, 48, 5);
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
