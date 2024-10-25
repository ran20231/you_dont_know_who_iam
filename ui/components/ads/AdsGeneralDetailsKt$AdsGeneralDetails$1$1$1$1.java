package com.forsale.ui.components.ads;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import coil.compose.AsyncImagePainter;
import com.forsale.designSystem.layouts.PlaceHolderKt;
import g00.l;
import g00.p;
import g00.q;
import h5.d;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdsGeneralDetails.kt */
/* loaded from: classes3.dex */
public final class AdsGeneralDetailsKt$AdsGeneralDetails$1$1$1$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42445a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsGeneralDetailsKt$AdsGeneralDetails$1$1$1$1(String str) {
        super(2);
        this.f42445a = str;
    }

    private static final boolean e(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    public final void c(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1339082038, i11, -1, "com.forsale.ui.components.ads.AdsGeneralDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsGeneralDetails.kt:56)");
        }
        aVar.C(-492369756);
        Object D = aVar.D();
        a.C0064a c0064a = a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(Boolean.FALSE, null, 2, null);
            aVar.u(D);
        }
        aVar.S();
        k0 k0Var = (k0) D;
        String str = this.f42445a;
        if (str == null) {
            str = "";
        }
        aVar.C(1157296644);
        boolean T = aVar.T(k0Var);
        Object D2 = aVar.D();
        if (T || D2 == c0064a.a()) {
            D2 = new AdsGeneralDetailsKt$AdsGeneralDetails$1$1$1$1$painter$1$1(k0Var);
            aVar.u(D2);
        }
        aVar.S();
        l lVar = (l) D2;
        aVar.C(1157296644);
        boolean T2 = aVar.T(k0Var);
        Object D3 = aVar.D();
        if (T2 || D3 == c0064a.a()) {
            D3 = new AdsGeneralDetailsKt$AdsGeneralDetails$1$1$1$1$painter$2$1(k0Var);
            aVar.u(D3);
        }
        aVar.S();
        AsyncImagePainter b11 = d.b(str, null, null, null, lVar, (l) D3, null, null, 0, aVar, 0, 462);
        aVar.C(733328855);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 g11 = BoxKt.g(b.f74009a.o(), false, aVar, 0);
        aVar.C(-1323940314);
        int a11 = e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(aVar2);
        if (!(aVar.k() instanceof j0.d)) {
            e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a12);
        } else {
            aVar.t();
        }
        a a13 = Updater.a(aVar);
        Updater.c(a13, g11, companion.e());
        Updater.c(a13, s11, companion.g());
        p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b12);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        aVar.C(2079222975);
        if (e(k0Var)) {
            PlaceHolderKt.a(AspectRatioKt.a(aVar2, 0.75f, false), aVar, 6);
        }
        aVar.S();
        ImageKt.a(b11, null, AspectRatioKt.a(SizeKt.h(aVar2, 0.0f, 1, null), 0.75f, true), null, androidx.compose.ui.layout.c.f8188a.b(), 0.0f, null, aVar, 25008, 104);
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
        c(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
