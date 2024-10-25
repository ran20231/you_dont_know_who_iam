package com.forsale.designSystem.layouts;

import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlaceHolder.kt */
/* loaded from: classes3.dex */
public final class PlaceHolderKt$Placeholder$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41789a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41790b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceHolderKt$Placeholder$2(androidx.compose.ui.c cVar, int i11) {
        super(2);
        this.f41789a = cVar;
        this.f41790b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        PlaceHolderKt.a(this.f41789a, aVar, v0.a(this.f41790b | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
