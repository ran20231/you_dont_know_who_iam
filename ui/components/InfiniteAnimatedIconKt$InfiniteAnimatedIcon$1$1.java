package com.forsale.ui.components;

import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: InfiniteAnimatedIcon.kt */
/* loaded from: classes3.dex */
final class InfiniteAnimatedIconKt$InfiniteAnimatedIcon$1$1 extends Lambda implements l<c, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutDirection f42309a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimatedIconKt$InfiniteAnimatedIcon$1$1(LayoutDirection layoutDirection) {
        super(1);
        this.f42309a = layoutDirection;
    }

    public final void b(c graphicsLayer) {
        float f11;
        o.i(graphicsLayer, "$this$graphicsLayer");
        if (this.f42309a == LayoutDirection.Rtl) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        graphicsLayer.m(f11);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(c cVar) {
        b(cVar);
        return p.f75480a;
    }
}
