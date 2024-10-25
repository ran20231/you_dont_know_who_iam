package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import com.forsale.designSystem.avatars.AvatarSize;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import v.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Avatars.kt */
/* loaded from: classes3.dex */
public final class AvatarsKt$Avatar$8 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42242a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Painter f42243b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42244c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f42245d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k f42246e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AvatarSize f42247f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f42248g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f42249h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarsKt$Avatar$8(c cVar, Painter painter, g00.a<wz.p> aVar, boolean z11, k kVar, AvatarSize avatarSize, int i11, int i12) {
        super(2);
        this.f42242a = cVar;
        this.f42243b = painter;
        this.f42244c = aVar;
        this.f42245d = z11;
        this.f42246e = kVar;
        this.f42247f = avatarSize;
        this.f42248g = i11;
        this.f42249h = i12;
    }

    public final void b(a aVar, int i11) {
        AvatarsKt.a(this.f42242a, this.f42243b, this.f42244c, this.f42245d, this.f42246e, this.f42247f, aVar, v0.a(this.f42248g | 1), this.f42249h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
