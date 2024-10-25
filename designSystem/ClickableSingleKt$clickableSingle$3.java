package com.forsale.designSystem;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.ui.c;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import q1.i;
import s.n;
import v.k;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClickableSingle.kt */
/* loaded from: classes3.dex */
public final class ClickableSingleKt$clickableSingle$3 extends Lambda implements q<c, androidx.compose.runtime.a, Integer, c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f40636a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n f40637b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f40638c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f40639d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f40640e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f40641f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClickableSingle.kt */
    /* renamed from: com.forsale.designSystem.ClickableSingleKt$clickableSingle$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements g00.a<p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f40642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g00.a<p> f40643b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ClickableSingle.kt */
        /* renamed from: com.forsale.designSystem.ClickableSingleKt$clickableSingle$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C04621 extends Lambda implements g00.a<p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g00.a<p> f40644a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04621(g00.a<p> aVar) {
                super(0);
                this.f40644a = aVar;
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f40644a.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(a aVar, g00.a<p> aVar2) {
            super(0);
            this.f40642a = aVar;
            this.f40643b = aVar2;
        }

        @Override // g00.a
        public /* bridge */ /* synthetic */ p invoke() {
            invoke2();
            return p.f75480a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f40642a.a(new C04621(this.f40643b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableSingleKt$clickableSingle$3(k kVar, n nVar, boolean z11, String str, i iVar, g00.a<p> aVar) {
        super(3);
        this.f40636a = kVar;
        this.f40637b = nVar;
        this.f40638c = z11;
        this.f40639d = str;
        this.f40640e = iVar;
        this.f40641f = aVar;
    }

    public final c b(c composed, androidx.compose.runtime.a aVar, int i11) {
        o.i(composed, "$this$composed");
        aVar.C(108104572);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(108104572, i11, -1, "com.forsale.designSystem.clickableSingle.<anonymous> (ClickableSingle.kt:60)");
        }
        aVar.C(-492369756);
        Object D = aVar.D();
        if (D == androidx.compose.runtime.a.f7182a.a()) {
            D = ClickableSingleKt.b(a.f40754a);
            aVar.u(D);
        }
        aVar.S();
        c b11 = ClickableKt.b(c.f7566a, this.f40636a, this.f40637b, this.f40638c, this.f40639d, this.f40640e, new AnonymousClass1((a) D, this.f40641f));
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return b11;
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ c invoke(c cVar, androidx.compose.runtime.a aVar, Integer num) {
        return b(cVar, aVar, num.intValue());
    }
}
