package com.forsale.designSystem.layouts;

import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Poster.kt */
/* loaded from: classes3.dex */
public final class PosterKt$Poster$4 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f41794a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f41795b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41796c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f41797d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ float f41798e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41799f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41800g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41801h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosterKt$Poster$4(Painter painter, boolean z11, androidx.compose.ui.c cVar, boolean z12, float f11, g00.a<wz.p> aVar, int i11, int i12) {
        super(2);
        this.f41794a = painter;
        this.f41795b = z11;
        this.f41796c = cVar;
        this.f41797d = z12;
        this.f41798e = f11;
        this.f41799f = aVar;
        this.f41800g = i11;
        this.f41801h = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        PosterKt.b(this.f41794a, this.f41795b, this.f41796c, this.f41797d, this.f41798e, this.f41799f, aVar, v0.a(this.f41800g | 1), this.f41801h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
