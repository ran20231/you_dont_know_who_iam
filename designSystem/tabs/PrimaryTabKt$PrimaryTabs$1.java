package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import g00.l;
import g00.p;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.Lambda;
import r0.b;
/* compiled from: PrimaryTab.kt */
/* loaded from: classes3.dex */
final class PrimaryTabKt$PrimaryTabs$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<ck.a> f42076a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42077b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<Integer, wz.p> f42078c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f42079d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrimaryTabKt$PrimaryTabs$1(List<ck.a> list, int i11, l<? super Integer, wz.p> lVar, int i12) {
        super(2);
        this.f42076a = list;
        this.f42077b = i11;
        this.f42078c = lVar;
        this.f42079d = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b(a aVar, int i11) {
        boolean z11;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(693246633, i11, -1, "com.forsale.designSystem.tabs.PrimaryTabs.<anonymous> (PrimaryTab.kt:35)");
        }
        int i12 = this.f42077b;
        l<Integer, wz.p> lVar = this.f42078c;
        int i13 = 0;
        for (Object obj : this.f42076a) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                r.x();
            }
            ck.a aVar2 = (ck.a) obj;
            if (i13 == i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            Integer valueOf = Integer.valueOf(i13);
            aVar.C(511388516);
            boolean T = aVar.T(valueOf) | aVar.T(lVar);
            Object D = aVar.D();
            if (T || D == a.f7182a.a()) {
                D = new PrimaryTabKt$PrimaryTabs$1$1$1$1(lVar, i13);
                aVar.u(D);
            }
            aVar.S();
            PrimaryTabsRowKt.c(z11, D, null, b.b(aVar, 1674132903, true, new PrimaryTabKt$PrimaryTabs$1$1$2(aVar2, i12, i13)), aVar, 3072, 4);
            i13 = i14;
        }
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
