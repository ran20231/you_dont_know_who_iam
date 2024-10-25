package com.forsale.designSystem.tags;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.typography.ValuesKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.t;
import w.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Tags.kt */
/* loaded from: classes3.dex */
public final class TagsKt$Tag$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TagData f42194a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42195b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q<t, a, Integer, wz.p> f42196c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Tags.kt */
    /* renamed from: com.forsale.designSystem.tags.TagsKt$Tag$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements p<a, Integer, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TagData f42197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<t, a, Integer, wz.p> f42198b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(TagData tagData, q<? super t, ? super a, ? super Integer, wz.p> qVar, int i11) {
            super(2);
            this.f42197a = tagData;
            this.f42198b = qVar;
            this.f42199c = i11;
        }

        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(484706202, i11, -1, "com.forsale.designSystem.tags.Tag.<anonymous>.<anonymous> (Tags.kt:31)");
            }
            androidx.compose.ui.c k11 = PaddingKt.k(SizeKt.a(androidx.compose.ui.c.f7566a, this.f42197a.e(), this.f42197a.e()), this.f42197a.f(), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.f3698a;
            float i12 = this.f42197a.i();
            b.a aVar2 = b.f74009a;
            Arrangement.e p11 = arrangement.p(i12, aVar2.g());
            b.c i13 = aVar2.i();
            q<t, a, Integer, wz.p> qVar = this.f42198b;
            int i14 = ((this.f42199c >> 3) & 7168) | 384;
            aVar.C(693286680);
            int i15 = i14 >> 3;
            a0 a11 = o.a(p11, i13, aVar, (i15 & 112) | (i15 & 14));
            aVar.C(-1323940314);
            int a12 = e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(k11);
            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
            if (!(aVar.k() instanceof d)) {
                e.c();
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
            if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, Integer.valueOf((i16 >> 3) & 112));
            aVar.C(2058660585);
            qVar.invoke(u.f74924a, aVar, Integer.valueOf(((i14 >> 6) & 112) | 6));
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TagsKt$Tag$1(TagData tagData, int i11, q<? super t, ? super a, ? super Integer, wz.p> qVar) {
        super(2);
        this.f42194a = tagData;
        this.f42195b = i11;
        this.f42196c = qVar;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1186906842, i11, -1, "com.forsale.designSystem.tags.Tag.<anonymous> (Tags.kt:27)");
        }
        CompositionLocalKt.b(new t0[]{ValuesKt.c().c(this.f42194a.j(aVar, (this.f42195b >> 3) & 14)), IconKt.d().c(h.f(this.f42194a.g()))}, r0.b.b(aVar, 484706202, true, new AnonymousClass1(this.f42194a, this.f42196c, this.f42195b)), aVar, 56);
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
