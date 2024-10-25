package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeeAllCard.kt */
/* loaded from: classes3.dex */
public final class SeeAllCardKt$SeeAllCard$4 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42625a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f42626b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42627c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f42628d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42629e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeAllCardKt$SeeAllCard$4(c cVar, String str, g00.a<wz.p> aVar, int i11, int i12) {
        super(2);
        this.f42625a = cVar;
        this.f42626b = str;
        this.f42627c = aVar;
        this.f42628d = i11;
        this.f42629e = i12;
    }

    public final void b(a aVar, int i11) {
        SeeAllCardKt.a(this.f42625a, this.f42626b, this.f42627c, aVar, v0.a(this.f42628d | 1), this.f42629e);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
