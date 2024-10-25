package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import g00.p;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r0.b;
import w.t;
/* compiled from: State.kt */
/* loaded from: classes3.dex */
final class StateKt$State$4 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42409a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42410b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42411c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: State.kt */
    /* renamed from: com.forsale.ui.components.StateKt$State$4$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements q<t, a, Integer, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f42413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42414b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, int i11) {
            super(3);
            this.f42413a = str;
            this.f42414b = i11;
        }

        public final void b(t OutLineButton, a aVar, int i11) {
            o.i(OutLineButton, "$this$OutLineButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(-1241399505, i11, -1, "com.forsale.ui.components.State.<anonymous>.<anonymous> (State.kt:34)");
            }
            TextKt.a(this.f42413a, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, (this.f42414b >> 12) & 14, 0, 2046);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ wz.p invoke(t tVar, a aVar, Integer num) {
            b(tVar, aVar, num.intValue());
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateKt$State$4(String str, g00.a<wz.p> aVar, int i11) {
        super(2);
        this.f42409a = str;
        this.f42410b = aVar;
        this.f42411c = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(551308890, i11, -1, "com.forsale.ui.components.State.<anonymous> (State.kt:32)");
        }
        if (this.f42409a != null) {
            g00.a<wz.p> aVar2 = this.f42410b;
            aVar.C(1157296644);
            boolean T = aVar.T(aVar2);
            Object D = aVar.D();
            if (T || D == a.f7182a.a()) {
                D = new StateKt$State$4$1$1(aVar2);
                aVar.u(D);
            }
            aVar.S();
            ButtonsKt.h(D, null, ButtonData.f40994a.c(), false, null, null, null, null, null, null, b.b(aVar, -1241399505, true, new AnonymousClass2(this.f42409a, this.f42411c)), aVar, ButtonData.f40995b << 6, 6, 1018);
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
