package com.forsale.designSystem.inputs;

import androidx.compose.runtime.c;
import g00.l;
import g00.p;
import j0.k0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
public final class InputsKt$PasswordField$4 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0<Boolean> f41483a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41484b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41485c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f41486d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<Boolean, wz.p> f41487e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41488f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41489g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$PasswordField$4(k0<Boolean> k0Var, int i11, int i12, boolean z11, l<? super Boolean, wz.p> lVar, int i13, int i14) {
        super(2);
        this.f41483a = k0Var;
        this.f41484b = i11;
        this.f41485c = i12;
        this.f41486d = z11;
        this.f41487e = lVar;
        this.f41488f = i13;
        this.f41489g = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.a] */
    public final void b(androidx.compose.runtime.a aVar, int i11) {
        int i12;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(514282849, i11, -1, "com.forsale.designSystem.inputs.PasswordField.<anonymous> (Inputs.kt:791)");
        }
        if (this.f41483a.getValue().booleanValue()) {
            i12 = this.f41484b;
        } else {
            i12 = this.f41485c;
        }
        int i13 = i12;
        boolean z11 = this.f41486d;
        l<Boolean, wz.p> lVar = this.f41487e;
        k0<Boolean> k0Var = this.f41483a;
        aVar.C(511388516);
        boolean T = aVar.T(lVar) | aVar.T(k0Var);
        Object D = aVar.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new InputsKt$PasswordField$4$1$1(lVar, k0Var);
            aVar.u(D);
        }
        aVar.S();
        InputsKt.f(i13, 0.0f, z11, null, D, aVar, (this.f41489g >> 3) & 896, 10);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
