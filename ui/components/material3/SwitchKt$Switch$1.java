package com.forsale.ui.components.material3;

import androidx.compose.material3.e;
import androidx.compose.material3.f;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.l;
import g00.p;
import kotlin.jvm.internal.Lambda;
import yj.d;
/* compiled from: Switch.kt */
/* loaded from: classes3.dex */
final class SwitchKt$Switch$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f42704a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<Boolean, wz.p> f42705b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f42706c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f42707d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42708e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchKt$Switch$1(boolean z11, l<? super Boolean, wz.p> lVar, c cVar, boolean z12, int i11) {
        super(2);
        this.f42704a = z11;
        this.f42705b = lVar;
        this.f42706c = cVar;
        this.f42707d = z12;
        this.f42708e = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1676588995, i11, -1, "com.forsale.ui.components.material3.Switch.<anonymous> (Switch.kt:43)");
        }
        f fVar = f.f6946a;
        dk.a aVar2 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        d g11 = aVar2.a(aVar, i12).g();
        int i13 = d.f76453b;
        long c11 = g11.c(aVar, i13);
        long i14 = aVar2.a(aVar, i12).f().i(aVar, i13);
        long g12 = aVar2.a(aVar, i12).e().g(aVar, i13);
        long c12 = aVar2.a(aVar, i12).g().c(aVar, i13);
        long f11 = aVar2.a(aVar, i12).e().f(aVar, i13);
        long e11 = aVar2.a(aVar, i12).e().e(aVar, i13);
        e b11 = fVar.b(c11, i14, 0L, 0L, c12, f11, g12, 0L, aVar2.a(aVar, i12).g().c(aVar, i13), aVar2.a(aVar, i12).f().d(aVar, i13), 0L, 0L, aVar2.a(aVar, i12).e().e(aVar, i13), aVar2.a(aVar, i12).e().h(aVar, i13), e11, 0L, aVar, 0, (f.f6948c | 0) << 18, 35980);
        boolean z11 = this.f42704a;
        l<Boolean, wz.p> lVar = this.f42705b;
        c cVar = this.f42706c;
        boolean z12 = this.f42707d;
        int i15 = this.f42708e;
        androidx.compose.material3.SwitchKt.a(z11, lVar, cVar, null, z12, b11, null, aVar, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 << 6) & 896) | ((i15 << 3) & 57344), 72);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
