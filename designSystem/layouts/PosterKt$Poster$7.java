package com.forsale.designSystem.layouts;

import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Poster.kt */
/* loaded from: classes3.dex */
public final class PosterKt$Poster$7 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f41804a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41805b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41806c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41807d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosterKt$Poster$7(Painter painter, androidx.compose.ui.c cVar, int i11, int i12) {
        super(2);
        this.f41804a = painter;
        this.f41805b = cVar;
        this.f41806c = i11;
        this.f41807d = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        PosterKt.a(this.f41804a, this.f41805b, aVar, v0.a(this.f41806c | 1), this.f41807d);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
