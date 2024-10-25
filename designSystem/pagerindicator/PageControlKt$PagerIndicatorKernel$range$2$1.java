package com.forsale.designSystem.pagerindicator;

import androidx.compose.runtime.c0;
import j0.k0;
import kotlin.jvm.internal.Lambda;
/* compiled from: PageControl.kt */
/* loaded from: classes3.dex */
final class PageControlKt$PagerIndicatorKernel$range$2$1 extends Lambda implements g00.a<k0<RangeChanged>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f42053a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageControlKt$PagerIndicatorKernel$range$2$1(b bVar) {
        super(0);
        this.f42053a = bVar;
    }

    @Override // g00.a
    /* renamed from: b */
    public final k0<RangeChanged> invoke() {
        k0<RangeChanged> e11;
        e11 = c0.e(new RangeChanged(0, this.f42053a.i() - 1), null, 2, null);
        return e11;
    }
}
