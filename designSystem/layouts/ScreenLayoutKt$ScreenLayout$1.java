package com.forsale.designSystem.layouts;

import g00.p;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenLayout.kt */
/* loaded from: classes3.dex */
public final class ScreenLayoutKt$ScreenLayout$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41812a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41813b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41814c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41815d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41816e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41817f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41818g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41819h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScreenLayoutKt$ScreenLayout$1(boolean z11, int i11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar3, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar4, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar5, int i12) {
        super(2);
        this.f41812a = z11;
        this.f41813b = i11;
        this.f41814c = pVar;
        this.f41815d = pVar2;
        this.f41816e = pVar3;
        this.f41817f = pVar4;
        this.f41818g = pVar5;
        this.f41819h = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1678235464, i11, -1, "com.forsale.designSystem.layouts.ScreenLayout.<anonymous> (ScreenLayout.kt:37)");
        }
        boolean z11 = this.f41812a;
        int i12 = this.f41813b;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41814c;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar2 = this.f41815d;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar3 = this.f41816e;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar4 = this.f41817f;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar5 = this.f41818g;
        int i13 = this.f41819h;
        ScreenLayoutKt.b(z11, i12, pVar, pVar2, pVar3, pVar4, pVar5, aVar, ((i13 >> 27) & 14) | ((i13 >> 21) & 112) | ((i13 >> 3) & 896) | ((i13 >> 3) & 7168) | ((i13 >> 6) & 57344) | (458752 & (i13 >> 6)) | ((i13 << 3) & 3670016));
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
