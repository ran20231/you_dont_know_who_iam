package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import g00.q;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import w.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
public final class BottomSheetsKt$Header$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f42251a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42252b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f42253c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q<t, a, Integer, wz.p> f42254d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42255e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42256f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetsKt$Header$2(Painter painter, g00.a<wz.p> aVar, String str, q<? super t, ? super a, ? super Integer, wz.p> qVar, int i11, int i12) {
        super(2);
        this.f42251a = painter;
        this.f42252b = aVar;
        this.f42253c = str;
        this.f42254d = qVar;
        this.f42255e = i11;
        this.f42256f = i12;
    }

    public final void b(a aVar, int i11) {
        BottomSheetsKt.a(this.f42251a, this.f42252b, this.f42253c, this.f42254d, aVar, v0.a(this.f42255e | 1), this.f42256f);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
