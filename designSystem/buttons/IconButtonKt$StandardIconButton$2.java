package com.forsale.designSystem.buttons;

import androidx.compose.ui.graphics.painter.Painter;
import b1.t1;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import v.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IconButton.kt */
/* loaded from: classes3.dex */
public final class IconButtonKt$StandardIconButton$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41185a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Painter f41186b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IconButtonShape f41187c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ IconButtonSize f41188d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41189e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f41190f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k f41191g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ t1 f41192h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f41193i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f41194j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonKt$StandardIconButton$2(g00.a<wz.p> aVar, Painter painter, IconButtonShape iconButtonShape, IconButtonSize iconButtonSize, androidx.compose.ui.c cVar, boolean z11, k kVar, t1 t1Var, int i11, int i12) {
        super(2);
        this.f41185a = aVar;
        this.f41186b = painter;
        this.f41187c = iconButtonShape;
        this.f41188d = iconButtonSize;
        this.f41189e = cVar;
        this.f41190f = z11;
        this.f41191g = kVar;
        this.f41192h = t1Var;
        this.f41193i = i11;
        this.f41194j = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        IconButtonKt.c(this.f41185a, this.f41186b, this.f41187c, this.f41188d, this.f41189e, this.f41190f, this.f41191g, this.f41192h, aVar, v0.a(this.f41193i | 1), this.f41194j);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
