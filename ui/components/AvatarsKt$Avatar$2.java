package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import com.forsale.designSystem.avatars.AvatarSize;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import v.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Avatars.kt */
/* loaded from: classes3.dex */
public final class AvatarsKt$Avatar$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42225a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42226b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f42227c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f42228d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AvatarSize f42229e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42230f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f42231g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarsKt$Avatar$2(c cVar, g00.a<wz.p> aVar, boolean z11, k kVar, AvatarSize avatarSize, int i11, int i12) {
        super(2);
        this.f42225a = cVar;
        this.f42226b = aVar;
        this.f42227c = z11;
        this.f42228d = kVar;
        this.f42229e = avatarSize;
        this.f42230f = i11;
        this.f42231g = i12;
    }

    public final void b(a aVar, int i11) {
        AvatarsKt.b(this.f42225a, this.f42226b, this.f42227c, this.f42228d, this.f42229e, aVar, v0.a(this.f42230f | 1), this.f42231g);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
