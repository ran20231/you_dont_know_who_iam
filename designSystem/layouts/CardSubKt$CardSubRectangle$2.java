package com.forsale.designSystem.layouts;

import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardSub.kt */
/* loaded from: classes3.dex */
public final class CardSubKt$CardSubRectangle$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41589a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41590b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Painter f41591c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41592d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41593e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41594f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardSubKt$CardSubRectangle$2(g00.a<wz.p> aVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, Painter painter, androidx.compose.ui.c cVar, int i11, int i12) {
        super(2);
        this.f41589a = aVar;
        this.f41590b = pVar;
        this.f41591c = painter;
        this.f41592d = cVar;
        this.f41593e = i11;
        this.f41594f = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        CardSubKt.b(this.f41589a, this.f41590b, this.f41591c, this.f41592d, aVar, v0.a(this.f41593e | 1), this.f41594f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
