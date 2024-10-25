package com.forsale.designSystem.pagerindicator;

import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.b0;
import androidx.compose.ui.layout.c0;
import androidx.compose.ui.layout.z;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: PageControl.kt */
/* loaded from: classes3.dex */
final class PageControlKt$PagerIndicatorKernel$3$2 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bk.a f42037a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42038b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PageControlKt$PagerIndicatorKernel$3$2(bk.a aVar, int i11) {
        this.f42037a = aVar;
        this.f42038b = i11;
    }

    @Override // androidx.compose.ui.layout.a0
    public final b0 c(c0 Layout, List<? extends z> measurables, long j11) {
        o.i(Layout, "$this$Layout");
        o.i(measurables, "measurables");
        return c0.i1(Layout, e2.b.n(j11), e2.b.m(j11), null, new PageControlKt$PagerIndicatorKernel$3$2$measure$1(measurables.get(0).P(j11), this.f42037a, this.f42038b), 4, null);
    }
}
