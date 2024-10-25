package com.forsale.designSystem.badges;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Badges.kt */
/* loaded from: classes3.dex */
public final class BadgesKt$DotBadge$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f40767a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f40768b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f40769c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f40770d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f40771e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgesKt$DotBadge$1(c cVar, long j11, float f11, int i11, int i12) {
        super(2);
        this.f40767a = cVar;
        this.f40768b = j11;
        this.f40769c = f11;
        this.f40770d = i11;
        this.f40771e = i12;
    }

    public final void b(a aVar, int i11) {
        BadgesKt.a(this.f40767a, this.f40768b, this.f40769c, aVar, v0.a(this.f40770d | 1), this.f40771e);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
