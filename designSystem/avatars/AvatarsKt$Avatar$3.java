package com.forsale.designSystem.avatars;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import v.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Avatars.kt */
/* loaded from: classes3.dex */
public final class AvatarsKt$Avatar$3 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f40758a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f40759b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f40760c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f40761d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k f40762e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ tj.a f40763f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f40764g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f40765h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AvatarsKt$Avatar$3(c cVar, p<? super a, ? super Integer, wz.p> pVar, g00.a<wz.p> aVar, boolean z11, k kVar, tj.a aVar2, int i11, int i12) {
        super(2);
        this.f40758a = cVar;
        this.f40759b = pVar;
        this.f40760c = aVar;
        this.f40761d = z11;
        this.f40762e = kVar;
        this.f40763f = aVar2;
        this.f40764g = i11;
        this.f40765h = i12;
    }

    public final void b(a aVar, int i11) {
        AvatarsKt.a(this.f40758a, this.f40759b, this.f40760c, this.f40761d, this.f40762e, this.f40763f, aVar, v0.a(this.f40764g | 1), this.f40765h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
