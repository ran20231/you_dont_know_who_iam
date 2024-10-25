package com.forsale.designSystem.badges;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Badges.kt */
/* loaded from: classes3.dex */
public final class BadgesKt$NumericValueBadge$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f40776a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f40777b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f40778c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f40779d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f40780e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BadgesKt$NumericValueBadge$2(c cVar, long j11, p<? super a, ? super Integer, wz.p> pVar, int i11, int i12) {
        super(2);
        this.f40776a = cVar;
        this.f40777b = j11;
        this.f40778c = pVar;
        this.f40779d = i11;
        this.f40780e = i12;
    }

    public final void b(a aVar, int i11) {
        BadgesKt.b(this.f40776a, this.f40777b, this.f40778c, aVar, v0.a(this.f40779d | 1), this.f40780e);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
