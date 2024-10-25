package com.forsale.designSystem.pagerindicator;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import e2.s;
import g00.l;
import g00.q;
import j0.k0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import w.d;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PageControl.kt */
/* loaded from: classes3.dex */
public final class PageControlKt$PageControl$3 extends Lambda implements q<d, androidx.compose.runtime.a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f42007a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f42008b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f42009c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f42010d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Orientation f42011e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l<Integer, Integer> f42012f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f42013g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f42014h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageControlKt$PageControl$3(int i11, k0<Integer> k0Var, b bVar, a aVar, Orientation orientation, l<? super Integer, Integer> lVar, boolean z11, int i12) {
        super(3);
        this.f42007a = i11;
        this.f42008b = k0Var;
        this.f42009c = bVar;
        this.f42010d = aVar;
        this.f42011e = orientation;
        this.f42012f = lVar;
        this.f42013g = z11;
        this.f42014h = i12;
    }

    public final void b(d BoxWithConstraints, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        o.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i11 & 14) == 0) {
            if (aVar.T(BoxWithConstraints)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 91) == 18 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(541097305, i11, -1, "com.forsale.designSystem.pagerindicator.PageControl.<anonymous> (PageControl.kt:149)");
        }
        e2.d dVar = (e2.d) aVar.q(CompositionLocalsKt.e());
        long a11 = s.a((int) dVar.m1(BoxWithConstraints.a()), (int) dVar.m1(BoxWithConstraints.c()));
        int i14 = this.f42007a;
        k0<Integer> k0Var = this.f42008b;
        b bVar = this.f42009c;
        a aVar2 = this.f42010d;
        Orientation orientation = this.f42011e;
        l<Integer, Integer> lVar = this.f42012f;
        boolean z11 = this.f42013g;
        int i15 = this.f42014h;
        PageControlKt.b(i14, k0Var, a11, bVar, aVar2, orientation, lVar, z11, aVar, ((i15 >> 6) & 14) | 32768 | (i15 & 112) | (i15 & 7168) | (458752 & i15) | (3670016 & i15) | (i15 & 29360128), 0);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(d dVar, androidx.compose.runtime.a aVar, Integer num) {
        b(dVar, aVar, num.intValue());
        return p.f75480a;
    }
}
