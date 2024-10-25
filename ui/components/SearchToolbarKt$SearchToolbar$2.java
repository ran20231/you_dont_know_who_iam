package com.forsale.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.inputs.InputsKt;
import d0.h;
import g00.l;
import g00.p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r0.b;
import s.n;
import v.k;
import z0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchToolbar.kt */
/* loaded from: classes3.dex */
public final class SearchToolbarKt$SearchToolbar$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42348a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f42349b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f42350c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<String, wz.p> f42351d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42352e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42353f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f42354g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ d f42355h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ k f42356i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ n f42357j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ Integer f42358x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ int f42359y;

    /* renamed from: z  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42360z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchToolbar.kt */
    /* renamed from: com.forsale.ui.components.SearchToolbarKt$SearchToolbar$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements p<a, Integer, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f42361a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, int i11) {
            super(2);
            this.f42361a = str;
            this.f42362b = i11;
        }

        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1777559695, i11, -1, "com.forsale.ui.components.SearchToolbar.<anonymous>.<anonymous> (SearchToolbar.kt:62)");
            }
            TextKt.a(this.f42361a, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, (this.f42362b >> 18) & 14, 0, 2046);
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
    /* compiled from: SearchToolbar.kt */
    /* renamed from: com.forsale.ui.components.SearchToolbarKt$SearchToolbar$2$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements l<h, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f42363a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f42364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(g00.a<wz.p> aVar, d dVar) {
            super(1);
            this.f42363a = aVar;
            this.f42364b = dVar;
        }

        public final void b(h $receiver) {
            o.i($receiver, "$this$$receiver");
            g00.a<wz.p> aVar = this.f42363a;
            if (aVar != null) {
                aVar.invoke();
            }
            d.j(this.f42364b, false, 1, null);
        }

        @Override // g00.l
        public /* bridge */ /* synthetic */ wz.p invoke(h hVar) {
            b(hVar);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchToolbarKt$SearchToolbar$2(c cVar, String str, String str2, l<? super String, wz.p> lVar, g00.a<wz.p> aVar, int i11, boolean z11, d dVar, k kVar, n nVar, Integer num, int i12, g00.a<wz.p> aVar2) {
        super(2);
        this.f42348a = cVar;
        this.f42349b = str;
        this.f42350c = str2;
        this.f42351d = lVar;
        this.f42352e = aVar;
        this.f42353f = i11;
        this.f42354g = z11;
        this.f42355h = dVar;
        this.f42356i = kVar;
        this.f42357j = nVar;
        this.f42358x = num;
        this.f42359y = i12;
        this.f42360z = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final void b(a aVar, int i11) {
        r0.a b11;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1339807053, i11, -1, "com.forsale.ui.components.SearchToolbar.<anonymous> (SearchToolbar.kt:52)");
        }
        c k11 = SizeKt.h(PaddingKt.m(c.f7566a, e2.h.l(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null).k(this.f42348a);
        String str = this.f42349b;
        if (str == null) {
            b11 = null;
        } else {
            b11 = b.b(aVar, -1777559695, true, new AnonymousClass1(str, this.f42353f));
        }
        androidx.compose.foundation.text.b bVar = new androidx.compose.foundation.text.b(null, null, null, null, new AnonymousClass2(this.f42360z, this.f42355h), null, 47, null);
        String str2 = this.f42350c;
        l<String, wz.p> lVar = this.f42351d;
        g00.a<wz.p> aVar2 = this.f42352e;
        aVar.C(1157296644);
        boolean T = aVar.T(aVar2);
        Object D = aVar.D();
        if (T || D == a.f7182a.a()) {
            D = new SearchToolbarKt$SearchToolbar$2$3$1(aVar2);
            aVar.u(D);
        }
        aVar.S();
        boolean z11 = this.f42354g;
        d dVar = this.f42355h;
        k kVar = this.f42356i;
        n nVar = this.f42357j;
        Integer num = this.f42358x;
        int i12 = this.f42353f;
        InputsKt.i(k11, str2, lVar, D, z11, 0, 0, b11, dVar, kVar, nVar, null, bVar, null, num, aVar, ((i12 << 3) & 112) | 134217728 | ((i12 << 3) & 896) | (i12 & 57344) | ((i12 << 3) & 1879048192), ((i12 >> 27) & 14) | ((this.f42359y << 9) & 57344), 10336);
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
