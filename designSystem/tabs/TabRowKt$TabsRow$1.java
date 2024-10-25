package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import g00.l;
import g00.p;
import java.util.List;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabRow.kt */
/* loaded from: classes3.dex */
public final class TabRowKt$TabsRow$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<String> f42166a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<Integer, wz.p> f42167b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42168c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f42169d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabsRow$1(List<String> list, l<? super Integer, wz.p> lVar, int i11, int i12) {
        super(2);
        this.f42166a = list;
        this.f42167b = lVar;
        this.f42168c = i11;
        this.f42169d = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.runtime.a] */
    public final void b(a aVar, int i11) {
        List b11;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1992431818, i11, -1, "com.forsale.designSystem.tabs.TabsRow.<anonymous> (TabRow.kt:45)");
        }
        List<String> list = this.f42166a;
        l<Integer, wz.p> lVar = this.f42167b;
        aVar.C(1157296644);
        boolean T = aVar.T(lVar);
        Object D = aVar.D();
        if (T || D == a.f7182a.a()) {
            D = new TabRowKt$TabsRow$1$tabPositions$1$1(lVar);
            aVar.u(D);
        }
        aVar.S();
        b11 = TabRowKt.b(list, D, this.f42169d, aVar, (this.f42168c & 896) | 8, 0);
        TabRowKt.a(b11, this.f42169d, 0.0f, aVar, ((this.f42168c >> 3) & 112) | 8, 4);
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
