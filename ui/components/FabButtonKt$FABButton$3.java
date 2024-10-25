package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import com.forsale.designSystem.buttons.ButtonFABData;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import s.n;
import v.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FabButton.kt */
/* loaded from: classes3.dex */
public final class FabButtonKt$FABButton$3 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42298a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42299b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ButtonFABData f42300c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Painter f42301d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f42302e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f42303f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ float f42304g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ k f42305h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ n f42306i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f42307j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ int f42308x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FabButtonKt$FABButton$3(c cVar, g00.a<wz.p> aVar, ButtonFABData buttonFABData, Painter painter, long j11, long j12, float f11, k kVar, n nVar, int i11, int i12) {
        super(2);
        this.f42298a = cVar;
        this.f42299b = aVar;
        this.f42300c = buttonFABData;
        this.f42301d = painter;
        this.f42302e = j11;
        this.f42303f = j12;
        this.f42304g = f11;
        this.f42305h = kVar;
        this.f42306i = nVar;
        this.f42307j = i11;
        this.f42308x = i12;
    }

    public final void b(a aVar, int i11) {
        FabButtonKt.a(this.f42298a, this.f42299b, this.f42300c, this.f42301d, this.f42302e, this.f42303f, this.f42304g, this.f42305h, this.f42306i, aVar, v0.a(this.f42307j | 1), this.f42308x);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
