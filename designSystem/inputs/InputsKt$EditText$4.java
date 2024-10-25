package com.forsale.designSystem.inputs;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.c;
import androidx.compose.ui.text.a0;
import e2.h;
import g00.p;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
public final class InputsKt$EditText$4 extends Lambda implements q<p<? super androidx.compose.runtime.a, ? super Integer, ? extends wz.p>, androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41411a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41412b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f41413c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a0 f41414d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41415e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41416f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$EditText$4(boolean z11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, long j11, a0 a0Var, int i11, int i12) {
        super(3);
        this.f41411a = z11;
        this.f41412b = pVar;
        this.f41413c = j11;
        this.f41414d = a0Var;
        this.f41415e = i11;
        this.f41416f = i12;
    }

    public final void b(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> innerTextField, androidx.compose.runtime.a aVar, int i11) {
        c cVar;
        b o11;
        int i12;
        o.i(innerTextField, "innerTextField");
        if ((i11 & 14) == 0) {
            if (aVar.F(innerTextField)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-889741780, i11, -1, "com.forsale.designSystem.inputs.EditText.<anonymous> (Inputs.kt:904)");
        }
        if (!this.f41411a) {
            float f11 = 12;
            cVar = PaddingKt.m(c.f7566a, 0.0f, h.l(f11), 0.0f, h.l(f11), 5, null);
        } else {
            cVar = c.f7566a;
        }
        c cVar2 = cVar;
        if (this.f41411a) {
            o11 = b.f74009a.h();
        } else {
            o11 = b.f74009a.o();
        }
        InputsKt.e(cVar2, innerTextField, this.f41412b, this.f41413c, this.f41414d, o11, aVar, ((i11 << 3) & 112) | ((this.f41415e >> 15) & 7168) | (57344 & this.f41416f), 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ wz.p invoke(p<? super androidx.compose.runtime.a, ? super Integer, ? extends wz.p> pVar, androidx.compose.runtime.a aVar, Integer num) {
        b(pVar, aVar, num.intValue());
        return wz.p.f75480a;
    }
}
