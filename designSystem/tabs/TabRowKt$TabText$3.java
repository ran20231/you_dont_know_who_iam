package com.forsale.designSystem.tabs;

import androidx.compose.runtime.a;
import androidx.compose.ui.text.w;
import g00.l;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabRow.kt */
/* loaded from: classes3.dex */
public final class TabRowKt$TabText$3 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42161a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f42162b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42163c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<w, wz.p> f42164d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42165e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabText$3(String str, long j11, g00.a<wz.p> aVar, l<? super w, wz.p> lVar, int i11) {
        super(2);
        this.f42161a = str;
        this.f42162b = j11;
        this.f42163c = aVar;
        this.f42164d = lVar;
        this.f42165e = i11;
    }

    public final void b(a aVar, int i11) {
        TabRowKt.g(this.f42161a, this.f42162b, this.f42163c, this.f42164d, aVar, v0.a(this.f42165e | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
