package com.forsale.designSystem.tags;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import g00.q;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import w.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Tags.kt */
/* loaded from: classes3.dex */
public final class TagsKt$Tag$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42200a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TagData f42201b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f42202c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f42203d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<t, a, Integer, wz.p> f42204e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42205f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f42206g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TagsKt$Tag$2(c cVar, TagData tagData, long j11, long j12, q<? super t, ? super a, ? super Integer, wz.p> qVar, int i11, int i12) {
        super(2);
        this.f42200a = cVar;
        this.f42201b = tagData;
        this.f42202c = j11;
        this.f42203d = j12;
        this.f42204e = qVar;
        this.f42205f = i11;
        this.f42206g = i12;
    }

    public final void b(a aVar, int i11) {
        TagsKt.a(this.f42200a, this.f42201b, this.f42202c, this.f42203d, this.f42204e, aVar, v0.a(this.f42205f | 1), this.f42206g);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
