package com.forsale.ui.components.dialog;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.t1;
import c0.g;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.colors.ValuesKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import j0.k;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
import w.e;
import w.f;
/* compiled from: Dialog.kt */
/* loaded from: classes3.dex */
final class DialogKt$Dialog$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42631a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f42632b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42633c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f42634d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<e, a, Integer, wz.p> f42635e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ DialogCtaType f42636f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42637g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42638h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Dialog.kt */
    /* renamed from: com.forsale.ui.components.dialog.DialogKt$Dialog$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements p<a, Integer, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f42639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42640b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f42641c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<e, a, Integer, wz.p> f42642d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DialogCtaType f42643e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<a, Integer, wz.p> f42644f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<a, Integer, wz.p> f42645g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(String str, int i11, String str2, q<? super e, ? super a, ? super Integer, wz.p> qVar, DialogCtaType dialogCtaType, p<? super a, ? super Integer, wz.p> pVar, p<? super a, ? super Integer, wz.p> pVar2) {
            super(2);
            this.f42639a = str;
            this.f42640b = i11;
            this.f42641c = str2;
            this.f42642d = qVar;
            this.f42643e = dialogCtaType;
            this.f42644f = pVar;
            this.f42645g = pVar2;
        }

        public final void b(a aVar, int i11) {
            c.a aVar2;
            float f11;
            dk.a aVar3;
            int i12;
            int i13;
            int i14;
            int i15;
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-792461241, i11, -1, "com.forsale.ui.components.dialog.Dialog.<anonymous>.<anonymous> (Dialog.kt:73)");
            }
            c.a aVar4 = c.f7566a;
            float f12 = 16;
            c m11 = PaddingKt.m(aVar4, h.l(f12), h.l(f12), 0.0f, 0.0f, 12, null);
            String str = this.f42639a;
            int i16 = this.f42640b;
            String str2 = this.f42641c;
            q<e, a, Integer, wz.p> qVar = this.f42642d;
            DialogCtaType dialogCtaType = this.f42643e;
            p<a, Integer, wz.p> pVar = this.f42644f;
            p<a, Integer, wz.p> pVar2 = this.f42645g;
            aVar.C(-483455358);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.m h11 = arrangement.h();
            b.a aVar5 = b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.e.a(h11, aVar5.k(), aVar, 0);
            aVar.C(-1323940314);
            int a12 = j0.e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(m11);
            if (!(aVar.k() instanceof d)) {
                j0.e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a13);
            } else {
                aVar.t();
            }
            a a14 = Updater.a(aVar);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            f fVar = f.f74891a;
            c m12 = PaddingKt.m(SizeKt.h(aVar4, 0.0f, 1, null), 0.0f, 0.0f, h.l(f12), h.l(f12), 3, null);
            aVar.C(-483455358);
            a0 a15 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar5.k(), aVar, 0);
            aVar.C(-1323940314);
            int a16 = j0.e.a(aVar, 0);
            k s12 = aVar.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, wz.p> c12 = LayoutKt.c(m12);
            if (!(aVar.k() instanceof d)) {
                j0.e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a17);
            } else {
                aVar.t();
            }
            a a18 = Updater.a(aVar);
            Updater.c(a18, a15, companion.e());
            Updater.c(a18, s12, companion.g());
            p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            dk.a aVar6 = dk.a.f54291a;
            int i17 = dk.a.f54292b;
            androidx.compose.ui.text.a0 l11 = aVar6.c(aVar, i17).l();
            yj.d e11 = aVar6.a(aVar, i17).e();
            int i18 = yj.d.f76453b;
            TextKt.a(str, null, 0, 0, false, 0, 0, null, l11, e11.m(aVar, i18), 0, aVar, (i16 >> 12) & 14, 0, 1278);
            float f13 = 8;
            SpacerKt.a(SizeKt.i(aVar4, h.l(f13)), aVar, 6);
            aVar.C(-1454916478);
            if (str2 != null) {
                i14 = i16;
                aVar3 = aVar6;
                i12 = i17;
                aVar2 = aVar4;
                i13 = i18;
                f11 = f13;
                TextKt.a(str2, null, 0, 0, false, 0, 0, null, aVar6.c(aVar, i17).d(), aVar6.a(aVar, i17).e().j(aVar, i18), 0, aVar, (i16 >> 15) & 14, 0, 1278);
            } else {
                aVar2 = aVar4;
                f11 = f13;
                aVar3 = aVar6;
                i12 = i17;
                i13 = i18;
                i14 = i16;
            }
            aVar.S();
            aVar.C(1488103596);
            if (qVar != null) {
                SpacerKt.a(SizeKt.i(aVar2, h.l(f11)), aVar, 6);
                i15 = i14;
                qVar.invoke(fVar, aVar, Integer.valueOf(6 | ((i15 >> 21) & 112)));
            } else {
                i15 = i14;
            }
            aVar.S();
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
            dk.a aVar7 = aVar3;
            int i19 = i12;
            CompositionLocalKt.b(new t0[]{androidx.compose.material.TextKt.d().c(aVar7.c(aVar, i19).f()), ValuesKt.d().c(t1.g(aVar7.a(aVar, i19).f().i(aVar, i13)))}, r0.b.b(aVar, 1681393533, true, new DialogKt$Dialog$2$1$1$2(dialogCtaType, pVar, pVar2, i15)), aVar, 56);
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogKt$Dialog$2(c cVar, String str, int i11, String str2, q<? super e, ? super a, ? super Integer, wz.p> qVar, DialogCtaType dialogCtaType, p<? super a, ? super Integer, wz.p> pVar, p<? super a, ? super Integer, wz.p> pVar2) {
        super(2);
        this.f42631a = cVar;
        this.f42632b = str;
        this.f42633c = i11;
        this.f42634d = str2;
        this.f42635e = qVar;
        this.f42636f = dialogCtaType;
        this.f42637g = pVar;
        this.f42638h = pVar2;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(328320548, i11, -1, "com.forsale.ui.components.dialog.Dialog.<anonymous> (Dialog.kt:68)");
        }
        androidx.compose.material.e.a(SizeKt.u(this.f42631a, h.l(312)), g.c(h.l(8)), 0L, 0L, null, 0.0f, r0.b.b(aVar, -792461241, true, new AnonymousClass1(this.f42632b, this.f42633c, this.f42634d, this.f42635e, this.f42636f, this.f42637g, this.f42638h)), aVar, 1572864, 60);
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
