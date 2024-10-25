package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: State.kt */
/* loaded from: classes3.dex */
public final class StateKt$State$5 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42415a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Painter f42416b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f42417c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f42418d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f42419e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42420f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f42421g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f42422h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateKt$State$5(c cVar, Painter painter, String str, String str2, String str3, g00.a<wz.p> aVar, int i11, int i12) {
        super(2);
        this.f42415a = cVar;
        this.f42416b = painter;
        this.f42417c = str;
        this.f42418d = str2;
        this.f42419e = str3;
        this.f42420f = aVar;
        this.f42421g = i11;
        this.f42422h = i12;
    }

    public final void b(a aVar, int i11) {
        StateKt.c(this.f42415a, this.f42416b, this.f42417c, this.f42418d, this.f42419e, this.f42420f, aVar, v0.a(this.f42421g | 1), this.f42422h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
