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
public final class AvatarsKt$Avatar$5 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42233a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f42234b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42235c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f42236d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k f42237e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AvatarSize f42238f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f42239g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f42240h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarsKt$Avatar$5(c cVar, String str, g00.a<wz.p> aVar, boolean z11, k kVar, AvatarSize avatarSize, int i11, int i12) {
        super(2);
        this.f42233a = cVar;
        this.f42234b = str;
        this.f42235c = aVar;
        this.f42236d = z11;
        this.f42237e = kVar;
        this.f42238f = avatarSize;
        this.f42239g = i11;
        this.f42240h = i12;
    }

    public final void b(a aVar, int i11) {
        AvatarsKt.c(this.f42233a, this.f42234b, this.f42235c, this.f42236d, this.f42237e, this.f42238f, aVar, v0.a(this.f42239g | 1), this.f42240h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
